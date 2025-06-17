import { check,sleep } from "k6";
import http from "k6/http";
import papaparse from 'https://jslib.k6.io/papaparse/5.1.1/index.js';
import { findBetween, randomIntBetween } from 'https://jslib.k6.io/k6-utils/1.2.0/index.js';
import { SharedArray } from 'k6/data';
import { generalSummary } from '../summaryConfig.js'
import { generateBody } from '../request/bodyRequest.js';

export const options = {
    stages: [
        { target: 10, duration: '10s' },
        { target: 10, duration: '5m' },
        { target: 15, duration: '5s' },
        { target: 15, duration: '2m'},
        { target: 10, duration: '5s' },
        { target: 10, duration: '5m' },
        { target: 25, duration: '15s' },
        { target: 25, duration: '2m' },
        { target: 10, duration: '15s' },
        { target: 10, duration: '5m' },
        { target: 0, duration: '10s' },
      ],
      thresholds: {
        http_req_duration: ['avg <= 3000'],
        http_req_failed: ['rate <= 0.06'],
        iterations: ['rate >= 1.54'],
      }
};

const csvData = new SharedArray('dataFromCSV', function () {
    return papaparse.parse(open('../data/RegresUser.csv'), { header: true }).data;
});

export default function () {
    
    const url = 'https://reqres.in/api/users?page=2';
    const params = { headers: { 
        'Content-Type': 'application/json',
        'x-api-key': `reqres-free-v1`
     } };
    const res = http.get(url, params);
    check(res, {
        "is status 200": (r) => r.status == "200"
    })
    sleep(12); //según lo indica en la matriz
    //console.log(JSON.stringify(res, null, 2));
    //const res_1 = http.get("https://fakestoreapi.com/products/{id}");
}

export function handleSummary(data) {
    return generalSummary(data)
}