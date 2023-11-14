**Задача: банкова система с изключения и наследяване**

**Въведение:**
Вие сте назначени да разработите  банкова система, използвайки Обектно-ориентирано програмиране (ООП).

**Инструкции:**

1. **Клас "Банкова Сметка" (Базов Клас):**
   - Създайте базов клас с име "BankAccount". Този клас ще служи като основен клас за различни видове сметки.
   - Включете следните атрибути в базовия клас:
     - "accountNumber" (String или int): Уникален номер на сметката.
     - "accountHolder" (Customer): Екземпляр на класа "Customer", представляващ притежателя на сметката.
     - "balance" (double): Текущият баланс на сметката.
   - Включете конструктор за инициализация на всички полета.
   - Реализирайте методи за извършване на основни операции:
     - "deposit(double amount)": Добавя посочената сума към баланса на сметката.
     - "withdraw(double amount)": Изважда посочената сума от баланса на сметката.
     - "getBalance()": Връща текущия баланс на сметката.
     -  добавете метод за изобразяване на информацията за сметката.
   - Създайте клас за грешка, наречен "InsufficientFundsException" (Грешка за Недостатъчни Средства), който е проверяема грешка и ще бъде извиквана, ако изтеглянето надхвърли баланса на сметката.

2. **Клас "Спестовна Сметка" (Наследява от Банкова Сметка):**
   - Създайте клас "SavingsAccount", който наследява от "BankAccount".
   - Реализирайте конструктор, който приема номера на сметката, притежателя на сметката и начален баланс.
   - Презапишете метода "withdraw", включвайки изискване за минимален баланс (например, 100 долара) и изхвърляйки "InsufficientFundsException" ако сумата за теглене би намалила баланса под минималния лимит.

3. **Клас "Текуща Сметка" (Наследява от Банкова Сметка):**
   - Създайте клас "CheckingAccount", който наследява от "BankAccount".
   - Реализирайте конструктор, подобен на този на класа "SavingsAccount", но без изискване за минимален баланс.
   - Презапишете метода "withdraw", за да позволите изтегляне без проверка на минимален баланс.

4. **Клас "Клиент" (Без Промени):**
   - Create a Customer class with the following attributes:
       - customerId (String or int): A unique identification number for each customer.
       - name (String): The customer's name.
       - accounts (List of Bank Accounts): A list of bank accounts owned by the customer.
       - Включете конструктор за инициализация на всички полета и празен масив за акаунти.
       - Implement a method to open a new bank account and add it to the customer's list.

5. **Клас "Транзакция" (Без Промени):**
  Create a Transaction class to represent financial transactions. This class can include attributes such as transaction ID, date, type (deposit or withdrawal), and amount.
  - Implement methods to record and display transaction details for each account.
  - The Transaction class will still represent financial transactions, and you can include attributes such as transaction ID, date, type (deposit or withdrawal), and amount.
  - Implement methods to record and display   transaction details for each account.

  - Когато транзакция е извършена, създавате нова транзакция и я добавята към вече създаден масив.

6. **Система на Банката:**
   - В основната ви програма - main-a, създайте инстанции на клиенти, спестовни и текущи сметки и извършвайте транзакции, за да продемонстрирате как работи подобрената банкова система.
   - Покажете примери за клиенти, които отварят различни видове сметки, депозират и изтеглят пари.
   - Обработете и изобразете съобщения за грешки при използване на персонализираната грешка "InsufficientFundsException".
   - Изобразете балансите на сметките и историята на транзакциите за различните видове сметки.

