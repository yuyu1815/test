/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\r\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\n\002\020\f\n\002\b\002\n\002\020\002\n\002\b\b\030\0002\0020\001B\005¢\006\002\020\002J\021\020\t\032\0020\n2\006\020\013\032\0020\004H\002J\036\020\f\032\0020\r2\006\020\016\032\0020\0042\006\020\017\032\0020\0042\006\020\020\032\0020\bJ\030\020\021\032\0020\0012\006\020\022\032\0020\0042\006\020\023\032\0020\004H\026J\b\020\024\032\0020\bH\026R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\016\020\007\032\0020\bX\016¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/utils/StringBuffer;", "", "()V", "length", "", "getLength", "()I", "text", "", "get", "", "index", "replace", "", "start", "endExclusive", "value", "subSequence", "startIndex", "endIndex", "toString", "utils-common"})
/*    */ public final class StringBuffer
/*    */   implements CharSequence
/*    */ {
/*    */   @NotNull
/* 83 */   private String text = "";
/*    */   
/*    */   public int getLength() {
/* 86 */     return this.text.length();
/*    */   } public char get(int index) {
/* 88 */     return this.text.charAt(index);
/*    */   } @NotNull
/*    */   public CharSequence subSequence(int startIndex, int endIndex) {
/* 91 */     return this.text.subSequence(startIndex, endIndex);
/*    */   }
/*    */   
/*    */   public final void replace(int start, int endExclusive, @NotNull String value) {
/* 95 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(this.text.substring(0, start), "substring(...)"); Intrinsics.checkNotNullExpressionValue(this.text.substring(endExclusive, this.text.length()), "substring(...)"); this.text = this.text.substring(0, start) + this.text.substring(0, start) + value;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 99 */     return this.text;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\StringBuffer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */