package kot

interface Repository {
    fun getAll(): List<String>
}

interface Logger {
    fun getID(): List<String>
}

// Solution
class Controller(val repository: Repository, val logger: Logger) : Repository by repository, Logger by logger

/*
class Controller (val repository :Repository , val logger:Logger): Repository,Logger{
    override fun getID(): List<String> {
        return logger.getID()
    }

    override fun getAll(): List<String> {
        return repository.getAll()
    }
}
*/

// delegate implementation of interface into other class.
// accept reference to concrete class that implement that interfaces
