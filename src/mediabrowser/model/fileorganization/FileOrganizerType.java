package mediabrowser.model.fileorganization;

public enum FileOrganizerType
{
	Movie,
	Episode,
	Song;

	public int getValue()
	{
		return this.ordinal();
	}

	public static FileOrganizerType forValue(int value)
	{
		return values()[value];
	}
}