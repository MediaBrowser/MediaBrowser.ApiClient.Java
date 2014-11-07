package mediabrowser.apiinteraction;

public class EmptyResponse implements IResponse {

    private IResponse innerResponse;

    public EmptyResponse(IResponse innerResponse){
        this.innerResponse = innerResponse;
    }

    public EmptyResponse(){

    }

    public void onResponse()
    {

    }

    @Override
    public void onError(Exception ex)
    {
        if (innerResponse != null){
            innerResponse.onError(ex);
        }
    }
}
