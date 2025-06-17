import { check,sleep } from "k6";
import http from "k6/http";
import papaparse from 'https://jslib.k6.io/papaparse/5.1.1/index.js';
import { findBetween, randomIntBetween } from 'https://jslib.k6.io/k6-utils/1.2.0/index.js';
import { SharedArray } from 'k6/data';
import { generalSummary } from '../summaryConfig.js'
import { generateBody } from '../request/bodyRequest.js';

export const options = {
    stages: [
        { target: 20, duration: '15m' }
      ],
      thresholds: {
        http_req_duration: ['avg <= 3000'],
        http_req_failed: ['rate <= 0.03'],
        iterations: ['rate >= 0.62'],
      }
};


const csvData = new SharedArray('dataFromCSV', function () {
    return papaparse.parse(open('../data/RegresUser.csv'), { header: true }).data;
});

export default function () {
    const randomData = csvData[Math.floor(Math.random() * csvData.length)];
    const url = 'https://reqres.in/api/users';
    const body = JSON.stringify(generateBody(randomData));
    const params = { headers: { 
        'Content-Type': 'application/json',
        'x-api-key': `reqres-free-v1`
     } };
    const res = http.post(url, body, params);
    check(res, {
        "is status 201": (r) => r.status == "201"
    })
    sleep(12); //según lo indica en la matriz
    //console.log(JSON.stringify(res, null, 2));
    //const res_1 = http.get("https://fakestoreapi.com/products/{id}");
}

export function handleSummary(data) {
    return generalSummary(data)
}