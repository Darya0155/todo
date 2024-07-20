INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('33d347a9-fdab-4853-9a56-112e9cc9fd8e', '-', '')),
    'Prepare presentation slides',
    'Create slides covering the project milestones, including charts and graphs to visualize the data.',
    1,  -- Assuming status code for 'IN_PROGRESS'
    '2024-08-10'
);
INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('e4eaaaf2-5b46-419b-b60c-c442ac93a52f', '-', '')),
    'Update project documentation',
    'Review and update project documentation based on recent changes and feedback.',
    3,  -- Assuming status code for 'DONE'
    '2024-08-20'
);
INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', '-', '')),
    'Send follow-up email',
    NULL,
    3,  -- Assuming status code for 'DONE'
    '2024-07-25'
);
