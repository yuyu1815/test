/*    */ package ai.grazie.utils.mpp;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\f\n\002\b\016\b\007\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\022\020\f\032\0020\r2\b\020\002\032\004\030\0010\001H\007J\006\020\016\032\0020\rJ\022\020\016\032\0020\r2\b\020\002\032\004\030\0010\001H\007J\006\020\017\032\0020\rJ\016\020\020\032\0020\0212\006\020\022\032\0020\003J\025\020\023\032\004\030\0010\0242\006\020\025\032\0020\t¢\006\002\020\026J\006\020\027\032\0020\021J\006\020\030\032\0020\024J\r\020\031\032\004\030\0010\024¢\006\002\020\032J\016\020\033\032\0020\r2\006\020\b\032\0020\tJ\016\020\034\032\0020\0212\006\020\022\032\0020\003J \020\035\032\n \036*\004\030\0010\0030\0032\006\020\037\032\0020\t2\b\b\002\020 \032\0020\tJ\b\020!\032\0020\003H\026R\022\020\005\032\0060\006j\002`\007X\004¢\006\002\n\000R\021\020\b\032\0020\t8F¢\006\006\032\004\b\n\020\013¨\006\""}, d2 = {"Lai/grazie/utils/mpp/StringBuilder;", "", "text", "", "(Ljava/lang/String;)V", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "length", "", "getLength", "()I", "append", "", "appendLine", "clear", "endsWith", "", "suffix", "getOrNull", "", "index", "(I)Ljava/lang/Character;", "isEmpty", "last", "lastOrNull", "()Ljava/lang/Character;", "setLength", "startsWith", "substring", "kotlin.jvm.PlatformType", "start", "endExclusive", "toString", "utils-common"})
/*    */ public final class StringBuilder {
/*    */   public StringBuilder(@NotNull String text) {
/*  8 */     this.builder = new java.lang.StringBuilder(text);
/*    */   } @NotNull
/*    */   private final java.lang.StringBuilder builder; public final void setLength(int length) {
/* 11 */     this.builder.setLength(length);
/*    */   }
/*    */   
/*    */   public final String substring(int start, int endExclusive) {
/* 15 */     return this.builder.substring(start, endExclusive);
/*    */   } @Nullable
/*    */   public final Character getOrNull(int index) {
/* 18 */     return StringsKt.getOrNull(this.builder, index);
/*    */   }
/*    */   public final int getLength() {
/* 21 */     return this.builder.length();
/*    */   }
/*    */   
/*    */   public final void append(@Nullable Object text) {
/* 25 */     if (text == null)
/* 26 */       return;  this.builder.append(text.toString());
/*    */   }
/*    */   public final boolean isEmpty() {
/* 29 */     return (this.builder.length() == 0);
/*    */   }
/*    */   public final char last() {
/* 32 */     return StringsKt.last(this.builder);
/*    */   } @Nullable
/*    */   public final Character lastOrNull() {
/* 35 */     return StringsKt.lastOrNull(this.builder);
/*    */   }
/*    */   public final void clear() {
/* 38 */     StringsKt.clear(this.builder);
/*    */   }
/*    */   
/* 41 */   public final boolean endsWith(@NotNull String suffix) { Intrinsics.checkNotNullParameter(suffix, "suffix"); return StringsKt.endsWith$default(this.builder, suffix, false, 2, null); } public final boolean startsWith(@NotNull String suffix) {
/* 42 */     Intrinsics.checkNotNullParameter(suffix, "suffix"); return StringsKt.startsWith$default(this.builder, suffix, false, 2, null);
/*    */   }
/*    */   public final void appendLine() {
/* 45 */     this.builder.append("\n");
/*    */   }
/*    */ 
/*    */   
/*    */   public final void appendLine(@Nullable Object text) {
/* 50 */     append(text);
/* 51 */     appendLine();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 55 */     Intrinsics.checkNotNullExpressionValue(this.builder.toString(), "builder.toString()"); return this.builder.toString();
/*    */   }
/*    */   
/*    */   public StringBuilder() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\StringBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */