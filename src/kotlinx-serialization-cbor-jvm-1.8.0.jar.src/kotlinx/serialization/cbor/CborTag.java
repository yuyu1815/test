package kotlinx.serialization.cbor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\021\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\020\020\004\032\0020\005XT¢\006\004\n\002\020\006R\020\020\007\032\0020\005XT¢\006\004\n\002\020\006R\020\020\b\032\0020\005XT¢\006\004\n\002\020\006R\020\020\t\032\0020\005XT¢\006\004\n\002\020\006R\020\020\n\032\0020\005XT¢\006\004\n\002\020\006R\020\020\013\032\0020\005XT¢\006\004\n\002\020\006R\020\020\f\032\0020\005XT¢\006\004\n\002\020\006R\020\020\r\032\0020\005XT¢\006\004\n\002\020\006R\020\020\016\032\0020\005XT¢\006\004\n\002\020\006R\020\020\017\032\0020\005XT¢\006\004\n\002\020\006R\020\020\020\032\0020\005XT¢\006\004\n\002\020\006R\020\020\021\032\0020\005XT¢\006\004\n\002\020\006R\020\020\022\032\0020\005XT¢\006\004\n\002\020\006R\020\020\023\032\0020\005XT¢\006\004\n\002\020\006R\020\020\024\032\0020\005XT¢\006\004\n\002\020\006R\020\020\025\032\0020\005XT¢\006\004\n\002\020\006¨\006\026"}, d2 = {"Lkotlinx/serialization/cbor/CborTag;", "", "<init>", "()V", "DATE_TIME_STANDARD", "Lkotlin/ULong;", "J", "DATE_TIME_EPOCH", "BIGNUM_POSITIVE", "BIGNUM_NEGAIVE", "DECIMAL_FRACTION", "BIGFLOAT", "BASE64_URL", "BASE64", "BASE16", "CBOR_ENCODED_DATA", "URI", "STRING_BASE64_URL", "STRING_BASE64", "REGEX", "MIME_MESSAGE", "CBOR_SELF_DESCRIBE", "kotlinx-serialization-cbor"})
public final class CborTag {
  @NotNull
  public static final CborTag INSTANCE = new CborTag();
  
  public static final long DATE_TIME_STANDARD = 0L;
  
  public static final long DATE_TIME_EPOCH = 1L;
  
  public static final long BIGNUM_POSITIVE = 2L;
  
  public static final long BIGNUM_NEGAIVE = 3L;
  
  public static final long DECIMAL_FRACTION = 4L;
  
  public static final long BIGFLOAT = 5L;
  
  public static final long BASE64_URL = 21L;
  
  public static final long BASE64 = 22L;
  
  public static final long BASE16 = 23L;
  
  public static final long CBOR_ENCODED_DATA = 24L;
  
  public static final long URI = 32L;
  
  public static final long STRING_BASE64_URL = 33L;
  
  public static final long STRING_BASE64 = 34L;
  
  public static final long REGEX = 35L;
  
  public static final long MIME_MESSAGE = 36L;
  
  public static final long CBOR_SELF_DESCRIBE = 55799L;
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\CborTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */