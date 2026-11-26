let primeNumbers = [];

for (let num = 0; num <= 500; num++) {

    if (num < 2) continue;

    let isPrime = true;

    for (let i = 2; i <= Math.sqrt(num); i++) {

        if (num % i === 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        primeNumbers.push(num);
    }
}

console.log("Prime numbers from 0 to 500:");

console.log(primeNumbers.join(", "));

console.log("Total prime numbers:", primeNumbers.length);