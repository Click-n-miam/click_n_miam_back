export const mockMeals = [
    {
        id: '1',
        name: 'Grilled Chicken',
        type: 'main',
        description: 'Tender grilled chicken breast with herbs',
        imageUrl: 'https://images.pexels.com/photos/2338407/pexels-photo-2338407.jpeg',
        allergens: ['eggs']
    },
    {
        id: '2',
        name: 'Vegetable Pasta',
        type: 'main',
        description: 'Penne pasta with fresh vegetables and tomato sauce',
        imageUrl: 'https://images.pexels.com/photos/1279330/pexels-photo-1279330.jpeg',
        allergens: ['gluten']
    },
    {
        id: '3',
        name: 'Rice Pilaf',
        type: 'side',
        description: 'Seasoned rice with vegetables and herbs',
        imageUrl: 'https://images.pexels.com/photos/723198/pexels-photo-723198.jpeg',
        allergens: []
    },
    {
        id: '4',
        name: 'Garden Salad',
        type: 'side',
        description: 'Fresh mixed greens with vinaigrette',
        imageUrl: 'https://images.pexels.com/photos/1059905/pexels-photo-1059905.jpeg',
        allergens: []
    },
    {
        id: '5',
        name: 'Yogurt',
        type: 'dairy',
        description: 'Creamy yogurt with granola and berries',
        imageUrl: 'https://images.pexels.com/photos/128865/pexels-photo-128865.jpeg',
        allergens: ['dairy']
    },
    {
        id: '6',
        name: 'Chocolate Pudding',
        type: 'dessert',
        description: 'Rich chocolate pudding with fresh berries',
        imageUrl: 'https://images.pexels.com/photos/3992132/pexels-photo-3992132.jpeg',
        allergens: ['dairy', 'eggs']
    },
    {
        id: '7',
        name: 'Fruit Salad',
        type: 'dessert',
        description: 'Fresh seasonal fruits',
        imageUrl: 'https://images.pexels.com/photos/1132047/pexels-photo-1132047.jpeg',
        allergens: []
    }
];

export const mockOrders = [
    {
        id: '1',
        studentName: 'John Smith',
        studentId: '512345',
        day: 'Tuesday',
        date: 'Apr 29',
        items: [
            {
                name: 'Grilled Chicken',
                quantity: 1,
                type: 'main',
                imageUrl: 'https://images.pexels.com/photos/2338407/pexels-photo-2338407.jpeg'
            },
            {
                name: 'Rice Pilaf',
                quantity: 1,
                type: 'side',
                imageUrl: 'https://images.pexels.com/photos/723198/pexels-photo-723198.jpeg'
            },
            {
                name: 'Yogurt',
                quantity: 1,
                type: 'dairy',
                imageUrl: 'https://images.pexels.com/photos/128865/pexels-photo-128865.jpeg'
            },
            {
                name: 'Chocolate Pudding',
                quantity: 1,
                type: 'dessert',
                imageUrl: 'https://images.pexels.com/photos/3992132/pexels-photo-3992132.jpeg'
            }
        ]
    },
    {
        id: '2',
        studentName: 'Emily Johnson',
        studentId: '512346',
        day: 'Tuesday',
        date: 'Apr 29',
        items: [
            {
                name: 'Vegetable Pasta',
                quantity: 1,
                type: 'main',
                imageUrl: 'https://images.pexels.com/photos/1279330/pexels-photo-1279330.jpeg'
            },
            {
                name: 'Garden Salad',
                quantity: 1,
                type: 'side',
                imageUrl: 'https://images.pexels.com/photos/1059905/pexels-photo-1059905.jpeg'
            },
            {
                name: 'Fruit Salad',
                quantity: 1,
                type: 'dessert',
                imageUrl: 'https://images.pexels.com/photos/1132047/pexels-photo-1132047.jpeg'
            }
        ]
    },
    {
        id: '3',
        studentName: 'Michael Brown',
        studentId: '512347',
        day: 'Saturday',
        date: 'May 3',
        items: [
            {
                name: 'Grilled Chicken',
                quantity: 1,
                type: 'main',
                imageUrl: 'https://images.pexels.com/photos/2338407/pexels-photo-2338407.jpeg'
            },
            {
                name: 'Garden Salad',
                quantity: 1,
                type: 'side',
                imageUrl: 'https://images.pexels.com/photos/1059905/pexels-photo-1059905.jpeg'
            },
            {
                name: 'Chocolate Pudding',
                quantity: 1,
                type: 'dessert',
                imageUrl: 'https://images.pexels.com/photos/3992132/pexels-photo-3992132.jpeg'
            }
        ]
    },
    {
        id: '4',
        studentName: 'Sarah Williams',
        studentId: '512348',
        day: 'Saturday',
        date: 'May 3',
        items: []
    }
];

export const mockWeeklyMenu = [
    {
        day: 'Tuesday',
        date: 'May 27',
        items: []
    },
    {
        day: 'Thursday',
        date: 'May 29',
        items: []
    }
];