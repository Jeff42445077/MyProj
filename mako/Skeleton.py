
# An instrument class that represents the data for a single symbol
class Instrument:

    def __init__(self, name):
        self.name = name
        self.maxPrice = 0
        self.minPrice = 0
        self.totalPrice = 0
        self.tradeCount = 0
        self.totalVolume = 0

    def addTrade(self, volume, price):
        # Complete this function
        self.tradeCount += 1
        self.totalVolume += volume
        self.totalPrice += (volume * price)
        if price > self.maxPrice:
            self.maxPrice = price
        if self.minPrice == 0 or price < self.minPrice:
            self.minPrice = price
        self.averagePrice = self.totalPrice / self.totalVolume if self.totalVolume > 0 else 0

    def printSummary(self):
        # Complete this function
        # Example - print('Symbol: {} Max Price: {} Min Price: {} Average Price: {} Total Volume: {}'.format(self.name, self.maxPrice, self.minPrice, averagePrice, self.totalVolume))
        # self.averagePrice = self.totalPrice / self.totalVolume

        print('Symbol: {} Max Price: {} Min Price: {} Average Price: {} Total Volume: {}'.format(
            self.name, self.maxPrice, self.minPrice, self.averagePrice, self.totalVolume))


def loadData(symbols, inputFile):
    # Open and read our input file
    with open(inputFile) as f:
        for line in f:
            # Split the CSV into it's components
            lineData = line.split(',')
            timestamp = int(lineData[0])
            symbol = lineData[1]
            volume = int(lineData[2])
            price = int(lineData[3])

            # Complete this function
            # The next step is to check for our symbol in the symbols dictionary
            if symbol in symbols:
                # and use the addTrade function to update the object.
                symbols[symbol].addTrade(volume, price)

            # If the symbol does not exist as a key in the symbols dictionary then
            else:
                # we need to create a new symbols object and add it.
                new_instrument = Instrument(symbol)
                new_instrument.addTrade(volume, price)
                symbols[symbol] = new_instrument


def printSummary(symbols):
    # For each symbol (sorted alphabetically) print the summary
    for key in sorted(symbols):
        instrument = symbols[key]
        instrument.printSummary()

# Main code


# A dictionary to store our instrument information
symbols = {}
inputFile = './input_data.csv'

loadData(symbols, inputFile)
printSummary(symbols)
