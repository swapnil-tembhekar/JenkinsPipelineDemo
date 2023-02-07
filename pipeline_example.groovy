node {
   stage('Build') {
      // Run the Taurus build
   }
   stage('Performance Tests') {
    parallel(
        BlazeMeterTest: {
            dir ('D:\\Projects\\Anaplan') {
                bat 'bzt testsamplefile.yml -report'
            }
        },
        Analysis: {
            sleep 60
        })
   }
}