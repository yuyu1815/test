/*    */ package ai.grazie.utils;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\002\b\n\n\002\030\002\n\002\b\003\030\000 \0272\0020\001:\001\027B\031\b\026\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006B!\b\002\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\b\b\002\020\004\032\0020\005¢\006\002\020\013J\016\020\020\032\0020\0002\006\020\021\032\0020\005J)\020\022\032\002H\023\"\b\b\000\020\023*\0020\b2\022\020\024\032\016\022\004\022\0020\b\022\004\022\002H\0230\025¢\006\002\020\026R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006\030"}, d2 = {"Lai/grazie/utils/ContentInputStream;", "Ljava/io/FilterInputStream;", "bytes", "", "type", "", "([BLjava/lang/String;)V", "inputStream", "Ljava/io/InputStream;", "size", "", "(Ljava/io/InputStream;JLjava/lang/String;)V", "getSize", "()J", "getType", "()Ljava/lang/String;", "alterType", "newType", "wrap", "T", "wrapper", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/io/InputStream;", "Companion", "utils-common"})
/*    */ public final class ContentInputStream extends FilterInputStream {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long size;
/*    */   
/*  8 */   public final long getSize() { return this.size; } @NotNull private final String type; @NotNull private static final String APPLICATION_OCTET_STREAM = "application/octet-stream"; @NotNull
/*  9 */   public final String getType() { return this.type; } private ContentInputStream(InputStream inputStream, long size, String type) {
/* 10 */     super(inputStream);
/*    */     this.size = size;
/*    */     this.type = type;
/*    */   } public ContentInputStream(@NotNull byte[] bytes, @NotNull String type) {
/* 14 */     this(
/*    */ 
/*    */         
/* 17 */         byteArrayInputStream, l, type);
/*    */   }
/*    */   @NotNull
/*    */   public final <T extends InputStream> T wrap(@NotNull Function1 wrapper) {
/* 21 */     Intrinsics.checkNotNullParameter(wrapper, "wrapper"); Intrinsics.checkNotNullExpressionValue(this.in, "`in`"); InputStream wrapped = (InputStream)wrapper.invoke(this.in);
/* 22 */     this.in = wrapped;
/*    */     
/* 24 */     return (T)wrapped;
/*    */   }
/*    */   @NotNull
/*    */   public final ContentInputStream alterType(@NotNull String newType) {
/* 28 */     Intrinsics.checkNotNullParameter(newType, "newType"); Intrinsics.checkNotNullExpressionValue(this.in, "`in`"); return Intrinsics.areEqual(newType, this.type) ? this : new ContentInputStream(this.in, this.size, newType);
/*    */   }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\004R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/ContentInputStream$Companion;", "", "()V", "APPLICATION_OCTET_STREAM", "", "fromInternalStream", "Lai/grazie/utils/ContentInputStream;", "inputStream", "Ljava/io/InputStream;", "size", "", "type", "utils-common"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final ContentInputStream fromInternalStream(@NotNull InputStream inputStream, long size, @NotNull String type) {
/* 35 */       Intrinsics.checkNotNullParameter(inputStream, "inputStream"); Intrinsics.checkNotNullParameter(type, "type"); return new ContentInputStream(inputStream, size, type, null);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\ContentInputStream.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */