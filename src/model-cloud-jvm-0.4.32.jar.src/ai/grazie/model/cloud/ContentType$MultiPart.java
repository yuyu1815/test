/*     */ package ai.grazie.model.cloud;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\021\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006¨\006\025"}, d2 = {"Lai/grazie/model/cloud/ContentType$MultiPart;", "", "()V", "Alternative", "Lai/grazie/model/cloud/ContentType;", "getAlternative", "()Lai/grazie/model/cloud/ContentType;", "Any", "getAny", "ByteRanges", "getByteRanges", "Encrypted", "getEncrypted", "FormData", "getFormData", "Mixed", "getMixed", "Related", "getRelated", "Signed", "getSigned", "model-cloud"})
/*     */ public final class MultiPart
/*     */ {
/*     */   @NotNull
/*  94 */   public static final MultiPart INSTANCE = new MultiPart(); @NotNull private static final ContentType Any = new ContentType("multipart", "*"); @NotNull public final ContentType getAny() { return Any; } @NotNull
/*  95 */   private static final ContentType Mixed = new ContentType("multipart", "mixed"); @NotNull public final ContentType getMixed() { return Mixed; } @NotNull
/*  96 */   private static final ContentType Alternative = new ContentType("multipart", "alternative"); @NotNull public final ContentType getAlternative() { return Alternative; } @NotNull
/*  97 */   private static final ContentType Related = new ContentType("multipart", "related"); @NotNull public final ContentType getRelated() { return Related; } @NotNull
/*  98 */   private static final ContentType FormData = new ContentType("multipart", "form-data"); @NotNull public final ContentType getFormData() { return FormData; } @NotNull
/*  99 */   private static final ContentType Signed = new ContentType("multipart", "signed"); @NotNull public final ContentType getSigned() { return Signed; } @NotNull
/* 100 */   private static final ContentType Encrypted = new ContentType("multipart", "encrypted"); @NotNull public final ContentType getEncrypted() { return Encrypted; } @NotNull
/* 101 */   private static final ContentType ByteRanges = new ContentType("multipart", "byteranges"); @NotNull public final ContentType getByteRanges() { return ByteRanges; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ContentType$MultiPart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */