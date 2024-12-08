INSERT INTO task (task_id, task, description, status, due_date)
VALUES (
    UNHEX(REPLACE('33d347a9-fdab-4853-9a56-112e9cc9fd8e', '-', '')),
    'Prepare presentation slides',
    'Create slides covering the project milestones, including charts and graphs to visualize the data.',
    1,  -- Assuming status code for 'IN_PROGRESS'
    '2024-08-10'
);

