let subjects = document.querySelectorAll(".subject");
let totalBox = document.getElementById("total");

subjects.forEach(item => {
    item.addEventListener("change", () => {
        let total = 0;

        subjects.forEach(sub => {
            if (sub.checked) {
                total += parseInt(sub.value);
            }
        });

        totalBox.innerText = "₹" + total;
    });
});


document.getElementById("regForm").addEventListener("submit", function(e){
    e.preventDefault();
      e.preventDefault();

    let selectedSubjects = [];
    let totalFee = 0;

    subjects.forEach(sub => {
        if (sub.checked) {
            let subjectName = sub.nextSibling.textContent.trim();
    
            selectedSubjects.push(subjectName);
            totalFee += parseInt(sub.value);
        }
    });
    

    if (selectedSubjects.length === 0) {
        alert("Please select at least one subject.");
        return;
    }

    let studentName = document.getElementById("name").value;
    var a=1;
    let message =
        "Student Name: " + studentName + "\n\n" +
        "Selected Subjects:\n "+ a++ + selectedSubjects.join("\n "+(a++)) + "\n\n" +
        "Total Fee: ₹" + totalFee;

    document.getElementById("result").innerText = message;
});