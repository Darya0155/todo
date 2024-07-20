CREATE TABLE IF NOT EXISTS task (
  task_id BINARY(16) NOT NULL,
   task VARCHAR(255) NULL,
   `description` VARCHAR(255) NULL,
   status TINYINT NULL,
   due_date datetime NULL,
   CONSTRAINT pk_task PRIMARY KEY (task_id)
);

INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('550e8400-e29b-41d4-a716-446655440000', '-', '')),
    'Complete project report',
    'Write a detailed report on the progress and findings of the project.',
    1,
    '2024-07-31'
);
INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('123e4567-e89b-12d3-a456-556642440000', '-', '')),
    'Review meeting agenda',
    'Prepare for the upcoming meeting and review the agenda items thoroughly.',
    1,
    '2024-08-05'
);

INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('c14a1ea0-6e08-4982-956e-4f1c5c57bd51', '-', '')),
    'Conduct user testing',
    'Schedule and conduct user testing sessions to gather feedback on the new features.',
    1,
    '2024-08-15'
);
