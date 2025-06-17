export const generateBody = (randomData) => {
    let dataJson =
    {
        name: randomData.nombre,
        job: randomData.trabajo,

    }
    return dataJson;
}