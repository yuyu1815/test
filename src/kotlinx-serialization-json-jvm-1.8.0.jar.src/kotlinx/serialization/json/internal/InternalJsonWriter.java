/*    */ package kotlinx.serialization.json.internal;@JsonFriendModuleApi
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\t\n\002\b\002\n\002\020\f\n\002\b\002\n\002\020\016\n\002\b\004\bg\030\000 \0162\0020\001:\001\016J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0032\006\020\007\032\0020\bH&J\020\020\t\032\0020\0032\006\020\n\032\0020\013H&J\020\020\f\032\0020\0032\006\020\n\032\0020\013H&J\b\020\r\032\0020\003H&¨\006\017À\006\003"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "release", "Companion", "kotlinx-serialization-json"})
/*    */ public interface InternalJsonWriter {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   void writeLong(long paramLong);
/*    */   
/*    */   void writeChar(char paramChar);
/*    */   
/*    */   void write(@NotNull String paramString);
/*    */   
/*    */   void writeQuoted(@NotNull String paramString);
/*    */   
/*    */   void release();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003Ja\020\004\032\0020\0052\006\020\006\032\0020\0072K\020\b\032G\022\023\022\0210\007¢\006\f\b\n\022\b\b\013\022\004\b\b(\006\022\023\022\0210\f¢\006\f\b\n\022\b\b\013\022\004\b\b(\r\022\023\022\0210\f¢\006\f\b\n\022\b\b\013\022\004\b\b(\016\022\004\022\0020\0050\tH\bø\001\000\002\007\n\005\b20\001¨\006\017"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter$Companion;", "", "<init>", "()V", "doWriteEscaping", "", "text", "", "writeImpl", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", "startIndex", "endIndex", "kotlinx-serialization-json"})
/*    */   public static final class Companion {
/*    */     public final void doWriteEscaping(@NotNull String text, @NotNull Function3 writeImpl) {
/* 20 */       Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(writeImpl, "writeImpl"); int $i$f$doWriteEscaping = 0, lastPos = 0;
/* 21 */       for (int i = 0, j = ((CharSequence)text).length(); i < j; i++) {
/* 22 */         int c = text.charAt(i);
/* 23 */         if (c < (StringOpsKt.getESCAPE_STRINGS()).length && StringOpsKt.getESCAPE_STRINGS()[c] != null) {
/* 24 */           writeImpl.invoke(text, Integer.valueOf(lastPos), Integer.valueOf(i));
/* 25 */           Intrinsics.checkNotNull(StringOpsKt.getESCAPE_STRINGS()[c]); String escape = StringOpsKt.getESCAPE_STRINGS()[c];
/* 26 */           writeImpl.invoke(escape, Integer.valueOf(0), Integer.valueOf(escape.length()));
/* 27 */           lastPos = i + 1;
/*    */         } 
/*    */       } 
/* 30 */       writeImpl.invoke(text, Integer.valueOf(lastPos), Integer.valueOf(text.length()));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\InternalJsonWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */