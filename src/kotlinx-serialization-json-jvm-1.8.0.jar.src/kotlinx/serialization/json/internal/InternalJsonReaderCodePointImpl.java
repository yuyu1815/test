/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JsonFriendModuleApi
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\b\n\000\n\002\020\f\n\002\b\003\n\002\020\031\n\002\b\003\b'\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H&J\b\020\006\032\0020\007H&J\036\020\013\032\0020\0072\006\020\f\032\0020\r2\006\020\016\032\0020\0072\006\020\017\032\0020\007R\022\020\b\032\004\030\0010\tX\016¢\006\004\n\002\020\n¨\006\020"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "<init>", "()V", "exhausted", "", "nextCodePoint", "", "bufferedChar", "", "Ljava/lang/Character;", "read", "buffer", "", "bufferOffset", "count", "kotlinx-serialization-json"})
/*    */ public abstract class InternalJsonReaderCodePointImpl
/*    */   implements InternalJsonReader
/*    */ {
/*    */   @Nullable
/*    */   private Character bufferedChar;
/*    */   
/*    */   public abstract boolean exhausted();
/*    */   
/*    */   public abstract int nextCodePoint();
/*    */   
/*    */   public final int read(@NotNull char[] buffer, int bufferOffset, int count) {
/* 55 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); int i = 0;
/*    */     
/* 57 */     if (this.bufferedChar != null) {
/* 58 */       Intrinsics.checkNotNull(this.bufferedChar); buffer[bufferOffset + i] = this.bufferedChar.charValue();
/* 59 */       i++;
/* 60 */       this.bufferedChar = null;
/*    */     } 
/*    */     
/* 63 */     while (i < count && !exhausted()) {
/* 64 */       int codePoint = nextCodePoint();
/* 65 */       if (codePoint <= 65535) {
/* 66 */         buffer[bufferOffset + i] = (char)codePoint;
/* 67 */         i++;
/*    */ 
/*    */         
/*    */         continue;
/*    */       } 
/*    */       
/* 73 */       char upChar = (char)((codePoint >>> 10) + 55232);
/* 74 */       char lowChar = (char)((codePoint & 0x3FF) + 56320);
/*    */       
/* 76 */       buffer[bufferOffset + i] = upChar;
/* 77 */       i++;
/*    */       
/* 79 */       if (i < count) {
/* 80 */         buffer[bufferOffset + i] = lowChar;
/* 81 */         i++;
/*    */         continue;
/*    */       } 
/* 84 */       this.bufferedChar = Character.valueOf(lowChar);
/*    */     } 
/*    */ 
/*    */     
/* 88 */     return (i > 0) ? i : -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\InternalJsonReaderCodePointImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */