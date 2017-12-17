package sumin.sample;

public class SungJukV6Service implements SungJukV6Impl {

	@Override
	public void Total(SungJukV6VO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		sj.setTot(tot);

	}

	@Override
	public void Average(SungJukV6VO sj) {
		double avg = sj.getTot() / 3.0;
		sj.setAvg(avg);

	}

	@Override
	public void Grade(SungJukV6VO sj) {
		switch ((int) sj.getAvg() / 10) {
		case 10:
		case 9:
			sj.setGrd('수');
			break;
		case 8:
			sj.setGrd('우');
			break;
		case 7:
			sj.setGrd('미');
			break;
		case 6:
			sj.setGrd('양');
			break;
		default:
			sj.setGrd('가');
			break;
		}

	}

}
