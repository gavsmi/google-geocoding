package com.bytebybyte.google.geocoding.service.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum LocationType {

	// indicates that the returned result is a precise geocode for which we have
	// location information accurate down to street address precision.
	ROOFTOP,

	// indicates that the returned result reflects an approximation (usually on
	// a road) interpolated between two precise points (such as intersections).
	// Interpolated results are generally returned when rooftop geocodes are
	// unavailable for a street address.
	RANGE_INTERPOLATED,

	// indicates that the returned result is the geometric center of a result
	// such as a polyline (for example, a street) or polygon (region).
	GEOMETRIC_CENTER,

	// indicates that the returned result is approximate.
	APPROXIMATE,

	// a catch all for cases where the enum could not be identified.
	UNKNOWN;

	@JsonCreator
	public static LocationType newInstance(String value) {
		try {
			return LocationType.valueOf(value);
		} catch (IllegalArgumentException e) {
			return LocationType.UNKNOWN;
		}
	}
}
