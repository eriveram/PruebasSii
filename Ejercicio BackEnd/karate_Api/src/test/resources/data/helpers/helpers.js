 function createRandomUser() {
      var names = ['Alice', 'Bob', 'Charlie', 'Denis', 'Eve'];
      var jobs = ['Developer', 'Tester', 'Manager', 'Designer', 'Analyst'];
      return {
        name: names[Math.floor(Math.random() * names.length)],
        job: jobs[Math.floor(Math.random() * jobs.length)]
      };
    }