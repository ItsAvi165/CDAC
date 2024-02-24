#!/bin/bash

# Accept sales and cost from the user
echo "Enter Sales:"
read sales

echo "Enter Cost:"
read cost

# Calculate profit
profit=$((sales - cost))

# Calculate taxes (10% of profit)
taxes=$(echo "scale=2; 0.1 * $profit" | bc)

# Calculate net profit (profit - taxes)
net_profit=$(echo "scale=2; $profit - $taxes" | bc)

# Display the result
echo "Profit: $profit"
echo "Taxes (10% of profit): $taxes"
echo "Net Profit: $net_profit"
