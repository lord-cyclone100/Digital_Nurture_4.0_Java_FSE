import logo from './logo.svg';
import './App.css';
import { CalculateScore } from '../src/components/CalculatorScore';

function App() {
  return (
    <div>
      <CalculateScore name={"Steeve"}
        school={"DNV Public School"}
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
