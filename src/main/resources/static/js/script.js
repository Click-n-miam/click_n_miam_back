// Navigation functionality
document.addEventListener('DOMContentLoaded', function() {
// View elements
const dashboardView = document.getElementById('dashboard-view');
const mealManagementView = document.getElementById('meal-management-view');
const ordersListView = document.getElementById('orders-list-view');
const weeklyMenuView = document.getElementById('weekly-menu-view');

// Navigation links
const dashboardLink = document.querySelector('.dashboard-link');
const mealManagementLink = document.querySelector('.meal-management-link');
const ordersListLink = document.querySelector('.orders-list-link');
const menusLink = document.querySelector('.menus-link');

// Quick action buttons
const addMealBtn = document.querySelector('#dashboard-view button:nth-child(1)');
const viewOrdersBtn = document.querySelector('#dashboard-view button:nth-child(2)');
const viewMenuBtn = document.querySelector('#dashboard-view button:nth-child(3)');

// Modal elements
const addMealModal = document.getElementById('add-meal-modal');
const closeModalBtns = document.querySelectorAll('.close-modal');
const addNewMealBtn = document.querySelector('.meal-management-view button');

// Helper function to hide all views
function hideAllViews() {
dashboardView.classList.add('hidden');
mealManagementView.classList.add('hidden');
ordersListView.classList.add('hidden');
weeklyMenuView.classList.add('hidden');
}

// Dashboard navigation
dashboardLink.addEventListener('click', function(e) {
e.preventDefault();
hideAllViews();
dashboardView.classList.remove('hidden');
});

// Meal Management navigation
mealManagementLink.addEventListener('click', function(e) {
e.preventDefault();
hideAllViews();
mealManagementView.classList.remove('hidden');
});

// Orders List navigation
ordersListLink.addEventListener('click', function(e) {
e.preventDefault();
hideAllViews();
ordersListView.classList.remove('hidden');
});

// Menus navigation
menusLink.addEventListener('click', function(e) {
e.preventDefault();
hideAllViews();
weeklyMenuView.classList.remove('hidden');
});

// Quick action: Add Meal
if (addMealBtn) {
addMealBtn.addEventListener('click', function() {
hideAllViews();
mealManagementView.classList.remove('hidden');
addMealModal.classList.remove('hidden');
});
}

// Quick action: View Orders
if (viewOrdersBtn) {
viewOrdersBtn.addEventListener('click', function() {
hideAllViews();
ordersListView.classList.remove('hidden');
});
}

// Quick action: View Menu
if (viewMenuBtn) {
viewMenuBtn.addEventListener('click', function() {
hideAllViews();
weeklyMenuView.classList.remove('hidden');
});
}

// Add New Meal button in Meal Management
if (addNewMealBtn) {
addNewMealBtn.addEventListener('click', function() {
addMealModal.classList.remove('hidden');
});
}

// Close modal buttons
closeModalBtns.forEach(function(btn) {
btn.addEventListener('click', function() {
addMealModal.classList.add('hidden');
});
});

// Close modal when clicking outside
addMealModal.addEventListener('click', function(e) {
if (e.target === addMealModal) {
addMealModal.classList.add('hidden');
}
});
});
