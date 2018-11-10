public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    public EarthquakeLoader(Context context, String url) {
        super(context);
        // TODO: Finish implementing this constructor 
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method
    }
}
