execution:
- iterations: 1
  concurrency: 1
  scenario: with_script

scenarios:
  with_script:
    script: SampleTestPlan.jmx
    
reporting:
- module: passfail
  criteria:
  - "avg-rt>150ms for 10s, continue as failed"
  - "fail>50% for 10s, stop as failed"