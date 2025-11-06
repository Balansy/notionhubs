// Data Templates (แก้ไข array นี้เพื่อเพิ่ม/แก้ templates – เพิ่ม 'image' ถ้ามี URL รูป preview)
const templates = [
    {
        title: "3MIQ Goal Setting Notion Template",
        desc: "ตั้งเป้าหมายด้วยวิธี 3MIQ สร้าง Dreamboard และ Means Goals – เหมาะสำหรับการวางแผนปีใหม่",
        category: "Productivity",
        link: "https://danielmarthi.gumroad.com/l/goalsetting/readersdeal100",
        image: ""  // เพิ่ม URL รูป preview ถ้ามี เช่น "https://example.com/preview.jpg"
    },
    {
        title: "Ultimate 2025 Goal & Habit Tracker",
        desc: "สร้าง Vision board ตั้ง SMART goals และติดตาม habits รายวัน – มาพร้อม dashboard สวยงาม",
        category: "Productivity",
        link: "https://danielmarthi.gumroad.com/l/ultimategoaltracker",
        image: ""
    },
    {
        title: "Notion Goal Tracker",
        desc: "ประเมินชีวิต สร้างเป้าหมายที่ทำได้ และติดตามความคืบหน้า – ระบบแจ้งเตือนในตัว",
        category: "Productivity",
        link: "https://heyabdo.gumroad.com/l/Notion-Goal-Tracker",
        image: ""
    },
    {
        title: "My Day - Daily Notes & Tracking",
        desc: "บันทึกประจำวันพร้อมฐานข้อมูลสำหรับโภชนาการ การนอนหลับ และ habits – ใช้งานง่ายทุกวัน",
        category: "Personal",
        link: "https://danielmarthi.gumroad.com/l/myday/readersdeal100",
        image: ""
    },
    {
        title: "Notion Bullet Journal",
        desc: "บันทึกสร้างสรรค์แบบ bullet journal สำหรับ habits และความคิด – สไตล์ minimalistic",
        category: "Personal",
        link: "https://chrisnotion.gumroad.com/l/dshyx",
        image: ""
    },
    {
        title: "Notion Daily Journal",
        desc: "บันทึกประจำวันพร้อม prompts สำหรับการสะท้อนและวางแผนอนาคต – ช่วยพัฒนาตัวเอง",
        category: "Personal",
        link: "https://www.pathpages.com/free-notion-templates/notion-travel-manager",
        image: ""
    },
    {
        title: "Limitless Student OS",
        desc: "จัดการตารางเรียน การบ้าน โน้ต สุขภาพ และการเงินสำหรับนักเรียน – ครบวงจรสำหรับนักศึกษา",
        category: "Productivity",
        link: "https://danielmarthi.gumroad.com/l/studentos",
        image: ""
    },
    {
        title: "Budget Tracker",
        desc: "ติดตามรายได้ วางแผนงบประมาณ และคำนวณเหลือเท่าไหร่แบบอัตโนมัติ – ง่ายสำหรับมือใหม่",
        category: "Finance",
        link: "https://www.pathpages.com/free-notion-templates/notion-budget-tracker",
        image: ""
    },
    {
        title: "Finance Tracker",
        desc: "ติดตามค่าใช้จ่าย จัดการบัญชี และพิชิตเป้าหมายการเงิน – มี visualization ชัดเจน",
        category: "Finance",
        link: "https://www.notion.so/templates/finance-tracker-12",
        image: ""
    },
    {
        title: "Minimalistic Free Notion Travel Template",
        desc: "วางแผนการเดินทาง ติดตามสถานที่ และบันทึกความทรงจำ – เหมาะสำหรับนักเดินทาง",
        category: "Personal",
        link: "https://www.pathpages.com/free-notion-templates/notion-travel-manager",
        image: ""
    },
    {
        title: "Notion Life Gamification",
        desc: "ทำให้ชีวิตเป็นเกม จัดการ habits การเงิน และโครงการด้วย XP – สนุกและมีแรงจูงใจ",
        category: "Personal",
        link: "https://www.solt.ws/template/notion-life-gamification",
        image: ""
    },
    {
        title: "Get Things Done Notion GTD Dashboard",
        desc: "จัดการโครงการและงานด้วยวิธี GTD พร้อม tags และ notes – สำหรับคนยุ่ง",
        category: "Productivity",
        link: "https://www.solt.ws/template/notion-get-things-done-dashboard",
        image: ""
    },
    {
        title: "Notion Student Dashboard",
        desc: "จัดการโรงเรียนด้วยตาราง การบ้าน สอบ และโน้ตในธีม kawaii – น่ารักและมีประสิทธิภาพ",
        category: "Personal",
        link: "https://soltwagner.gumroad.com/l/notion-student-dashboard",
        image: ""
    },
    {
        title: "Time Blocking Template",
        desc: "จัดเวลาให้งาน ลด distraction และจัดการการเรียน – เทคนิค time management ยอดนิยม",
        category: "Productivity",
        link: "https://gumroad.com/a/1052587987/jjpnt",
        image: ""
    },
    {
        title: "Notion Aesthetic Beginners Pack",
        desc: "แพ็กเริ่มต้นสำหรับจัดการงาน โน้ต habits และโครงการ – สวยงามสำหรับมือใหม่",
        category: "Productivity",
        link: "https://gumroad.com/a/949791187/fjkncu",
        image: ""
    },
    {
        title: "Notion Ultimate Life Planner",
        desc: "วางแผนชีวิตทั้งหมด: habits การกิน การออกกำลังกาย การเงิน และเป้าหมาย – ครบจบในที่เดียว",
        category: "Personal",
        link: "https://soltwagner.gumroad.com/l/notion-ultimate-life-planner",
        image: ""
    },
    {
        title: "Notion Aesthethic Home Template",
        desc: "แดชบอร์ดน่ารักพร้อม GIFs และ widget สำหรับองค์กร – บรรยากาศอบอุ่น",
        category: "Personal",
        link: "https://www.notion.so/home-template-3-33f5ac44030749a2af2617b843fabfe5",
        image: ""
    },
    {
        title: "Notion Personal Dashboard",
        desc: "แดชบอร์ดสไตล์ lofi สำหรับ to-do การเงิน habits และหนังสือ – ชิลล์และมีสไตล์",
        category: "Personal",
        link: "https://soltwagner.gumroad.com/l/notion-personal-dashboard",
        image: ""
    },
    {
        title: "Free Meal Planner Notion Template",
        desc: "วางแผนมื้ออาหารประจำสัปดาห์พร้อมรายการซื้อของอัตโนมัติ – สุขภาพดีง่ายขึ้น",
        category: "Personal",
        link: "https://gumroad.com/a/463387091/tBFTY",
        image: ""
    },
    {
        title: "Notion Invoice Template",
        desc: "สร้าง invoice ง่าย ๆ สำหรับงานของคุณ – มืออาชีพและปรับแต่งได้",
        category: "Finance",
        link: "https://gumroad.com/a/332590803/rndna",
        image: ""
    },
    {
        title: "Notion Resume Template",
        desc: "สร้าง resume แบบ interactive ง่าย ๆ – โดดเด่นสำหรับหางาน",
        category: "Personal",
        link: "https://soltwagner.gumroad.com/l/notion-resume-template",
        image: ""
    },
    {
        title: "S.M.A.R.T Goals Tracker",
        desc: "ติดตามเป้าหมายแบบ visual สำหรับโครงการ – ตามหลัก SMART",
        category: "Productivity",
        link: "https://creative-templates.notion.site/S-M-A-R-T-Goals-Tracker-888ef980601d4d87929a5304f0a74d06",
        image: ""
    },
    {
        title: "Simple Project Management Board",
        desc: "บอร์ด Kanban สำหรับจัดการโครงการ – เรียบง่ายแต่ทรงพลัง",
        category: "Project Management",
        link: "https://concrete-animal-a3d.notion.site/b834b84a0ef74d9284a61dcfb8566172?v=cfae43e1840343a1a39b27f8c1e7e64b",
        image: ""
    },
    {
        title: "Tasks and Issues Template",
        desc: "ติดตามปัญหาและงาน แยกตามทีม – เหมาะสำหรับ dev team",
        category: "Project Management",
        link: "https://www.notion.so/5b593126d3eb401db62c83cbe362d2d5?v=a44397b3675545f389a6f28282c402ae",
        image: ""
    },
    {
        title: "Branch’s Engineering Roadmap",
        desc: "ติดตามงานทีมวิศวกรรมสำหรับ roadmap ผลิตภัณฑ์ – ระดับ enterprise",
        category: "Project Management",
        link: "https://notion.notion.site/cecd5ca390e94d96886fa6143e1f1b0f?v=8431957eb4a74195b5da76383277289f",
        image: ""
    },
    {
        title: "Loom’s Simple Project Plan",
        desc: "ช่วยเริ่มและจบโครงการให้สำเร็จ – ขั้นตอนชัดเจน",
        category: "Project Management",
        link: "https://notion.notion.site/Loom-s-simple-project-plan-0fb661b06eff402ab9c53287a1679ad6",
        image: ""
    },
    {
        title: "Weekly Status Report Template",
        desc: "สร้างรายงานสถานะประจำสัปดาห์สำหรับโครงการ – สื่อสารทีมง่าย",
        category: "Project Management",
        link: "https://chief-side-32c.notion.site/9668088d35d140ca918fd1bb2cee324e?v=4ae7a907a57a40d8a37990308daf739e",
        image: ""
    },
    {
        title: "Marketing Project Brief Template",
        desc: "ตรวจสอบก่อนเริ่มโครงการการตลาด – ครอบคลุมทุกด้าน",
        category: "Project Management",
        link: "https://www.notion.so/templates/marketing-project-brief",
        image: ""
    },
    {
        title: "Startup in a Box",
        desc: "ครอบคลุมไอเดียธุรกิจถึง OKRs สำหรับ startup – จากเริ่มต้นถึง scale",
        category: "Startups",
        link: "https://www.notion.so/templates/startup-in-a-box",
        image: ""
    },
    {
        title: "Funding OS Notion Template",
        desc: "ติดตามนักลงทุนและงาน fundraising – สำหรับ founder",
        category: "Startups",
        link: "https://www.notion.so/templates/funding-os",
        image: ""
    },
    {
        title: "ROI Calculator",
        desc: "คำนวณมูลค่าโครงการโดยเปรียบเทียบการลงทุนและรายได้ – เครื่องมือสำหรับธุรกิจ",
        category: "Finance",
        link: "https://www.notion.so/templates/roi-calculator",
        image: ""
    }
];

// Infinite Scroll variables
let filteredTemplates = [];  // Will hold the current filtered/sorted list
let currentIndex = 0;  // Current load index
const itemsPerLoad = 10;  // ปรับจำนวนต่อ batch ที่นี่
let isLoading = false;

// Render Cards (load batch)
function renderTemplates(batchTemplates) {
    const container = document.getElementById('templatesContainer');
    batchTemplates.forEach((template, index) => {
        const card = document.createElement('div');
        card.classList.add('template-card');
        card.style.animationDelay = `${index * 0.1}s`;
        card.innerHTML = `
            <h2>${template.title}</h2>
            <p>${template.desc.substring(0, 100)}...</p>
            <span>หมวด: ${template.category}</span>
        `;
        card.addEventListener('click', () => showModal(template));
        container.appendChild(card);
    });
}

// Load more items
function loadMore() {
    if (isLoading || currentIndex >= filteredTemplates.length) return;
    isLoading = true;
    document.getElementById('loadingIndicator').style.display = 'block';

    setTimeout(() => {  // Simulate load delay (remove if not needed)
        const nextBatch = filteredTemplates.slice(currentIndex, currentIndex + itemsPerLoad);
        renderTemplates(nextBatch);
        currentIndex += itemsPerLoad;
        isLoading = false;
        document.getElementById('loadingIndicator').style.display = 'none';
    }, 500);  // Adjust delay as needed
}

// Setup Infinite Scroll Observer
function setupObserver() {
    const observer = new IntersectionObserver(entries => {
        if (entries[0].isIntersecting) {
            loadMore();
        }
    }, { threshold: 0.1 });

    const sentinel = document.createElement('div');
    sentinel.id = 'sentinel';
    document.querySelector('main').appendChild(sentinel);
    observer.observe(sentinel);
}

// Populate Category Filter
function populateCategories() {
    const filter = document.getElementById('categoryFilter');
    const categories = [...new Set(templates.map(t => t.category))];
    categories.forEach(cat => {
        const option = document.createElement('option');
        option.value = cat.toLowerCase();
        option.textContent = cat;
        filter.appendChild(option);
    });
}

// Show Modal
function showModal(template) {
    const modal = document.getElementById('templateModal');
    document.getElementById('modalTitle').textContent = template.title;
    document.getElementById('modalDesc').textContent = template.desc;
    document.getElementById('modalCategory').textContent = `หมวด: ${template.category}`;
    document.getElementById('modalLink').href = template.link;

    const img = document.getElementById('modalImage');
    if (template.image) {
        img.src = template.image;
        img.style.display = 'block';
    } else {
        img.style.display = 'none';
    }

    modal.style.display = 'block';
}

// Close Modal
const closeBtn = document.querySelector('.close');
closeBtn.addEventListener('click', () => {
    document.getElementById('templateModal').style.display = 'none';
});

window.addEventListener('click', (event) => {
    if (event.target === document.getElementById('templateModal')) {
        document.getElementById('templateModal').style.display = 'none';
    }
});

// Search, Filter, and Sort
let currentSearchTerm = '';
let currentCategory = 'all';
let currentSort = 'title-asc';

function applyFilters() {
    filteredTemplates = templates.slice();  // Copy array

    if (currentCategory !== 'all') {
        filteredTemplates = filteredTemplates.filter(t => t.category.toLowerCase() === currentCategory);
    }

    if (currentSearchTerm) {
        filteredTemplates = filteredTemplates.filter(template => 
            template.title.toLowerCase().includes(currentSearchTerm) || 
            template.desc.toLowerCase().includes(currentSearchTerm) || 
            template.category.toLowerCase().includes(currentSearchTerm)
        );
    }

    // Parse sort value
    const [sortField, sortDir] = currentSort.split('-');

    // Sort by field
    filteredTemplates.sort((a, b) => {
        const valA = a[sortField].toLowerCase();
        const valB = b[sortField].toLowerCase();
        return valA.localeCompare(valB);
    });

    if (sortDir === 'desc') {
        filteredTemplates.reverse();
    }

    // Reset and render initial batch
    document.getElementById('templatesContainer').innerHTML = '';
    if (filteredTemplates.length === 0) {
        document.getElementById('templatesContainer').innerHTML = '<p style="text-align: center; width: 100%;">ไม่พบ templates ที่ตรงกัน</p>';
        return;
    }
    currentIndex = 0;
    loadMore();
}

document.getElementById('searchInput').addEventListener('input', function() {
    currentSearchTerm = this.value.toLowerCase();
    applyFilters();
});

document.getElementById('categoryFilter').addEventListener('change', function() {
    currentCategory = this.value;
    applyFilters();
});

document.getElementById('sortFilter').addEventListener('change', function() {
    currentSort = this.value;
    applyFilters();
});

// Dark Mode Toggle
document.getElementById('darkModeToggle').addEventListener('click', () => {
    document.body.classList.toggle('dark-mode');
    const btn = document.getElementById('darkModeToggle');
    btn.textContent = document.body.classList.contains('dark-mode') ? '☀️ Light Mode' : '🌙 Dark Mode';
});

// Initial Setup
populateCategories();
applyFilters();
setupObserver();
