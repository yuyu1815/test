/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\r\n\000\n\002\020\031\n\002\b\005\n\002\020\b\n\002\b\005\n\002\020\f\n\002\b\005\n\002\020\016\n\000\n\002\020\002\n\002\b\003\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\021\020\016\032\0020\0172\006\020\020\032\0020\tH\002J\030\020\021\032\0020\0012\006\020\022\032\0020\t2\006\020\023\032\0020\tH\026J\026\020\024\032\0020\0252\006\020\022\032\0020\t2\006\020\023\032\0020\tJ\016\020\026\032\0020\0272\006\020\030\032\0020\tJ\b\020\031\032\0020\025H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\r¨\006\032"}, d2 = {"Lkotlinx/serialization/json/internal/ArrayAsSequence;", "", "buffer", "", "<init>", "([C)V", "getBuffer$kotlinx_serialization_json", "()[C", "length", "", "getLength", "()I", "setLength", "(I)V", "get", "", "index", "subSequence", "startIndex", "endIndex", "substring", "", "trim", "", "newSize", "toString", "kotlinx-serialization-json"})
/*    */ public final class ArrayAsSequence implements CharSequence {
/*    */   @NotNull
/*    */   private final char[] buffer;
/*    */   private int length;
/*    */   
/*    */   @NotNull
/*    */   public final char[] getBuffer$kotlinx_serialization_json() {
/*    */     return this.buffer;
/*    */   }
/*    */   
/*    */   public ArrayAsSequence(@NotNull char[] buffer) {
/* 19 */     this.buffer = buffer;
/* 20 */     this.length = this.buffer.length; } public int getLength() { return this.length; } public void setLength(int <set-?>) { this.length = <set-?>; }
/*    */    public char get(int index) {
/* 22 */     return this.buffer[index];
/*    */   } @NotNull
/*    */   public CharSequence subSequence(int startIndex, int endIndex) {
/* 25 */     return StringsKt.concatToString(this.buffer, startIndex, Math.min(endIndex, length()));
/*    */   }
/*    */   @NotNull
/*    */   public final String substring(int startIndex, int endIndex) {
/* 29 */     return StringsKt.concatToString(this.buffer, startIndex, Math.min(endIndex, length()));
/*    */   }
/*    */   
/*    */   public final void trim(int newSize) {
/* 33 */     setLength(Math.min(this.buffer.length, newSize));
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 37 */     return substring(0, length());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ArrayAsSequence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */