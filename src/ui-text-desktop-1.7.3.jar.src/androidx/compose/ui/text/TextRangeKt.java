/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\t\n\002\b\006\n\002\020\016\n\002\020\r\n\002\b\004\032\023\020\000\032\0020\0012\006\020\002\032\0020\003¢\006\002\020\004\032\033\020\000\032\0020\0012\006\020\005\032\0020\0032\006\020\006\032\0020\003¢\006\002\020\007\032\030\020\b\032\0020\t2\006\020\005\032\0020\0032\006\020\006\032\0020\003H\002\032$\020\n\032\0020\001*\0020\0012\006\020\013\032\0020\0032\006\020\f\032\0020\003ø\001\000¢\006\004\b\r\020\016\032\034\020\017\032\0020\020*\0020\0212\006\020\022\032\0020\001ø\001\000¢\006\004\b\023\020\024\002\007\n\005\b¡\0360\001¨\006\025"}, d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", "index", "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "coerceIn", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n100#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:130\n*E\n"})
/*     */ public final class TextRangeKt
/*     */ {
/*     */   @NotNull
/*     */   public static final String substring-FDrldGo(@NotNull CharSequence $this$substring_u2dFDrldGo, long range) {
/*  24 */     Intrinsics.checkNotNullParameter($this$substring_u2dFDrldGo, "$this$substring"); return $this$substring_u2dFDrldGo.subSequence(TextRange.getMin-impl(range), TextRange.getMax-impl(range)).toString();
/*     */   }
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
/*     */   public static final long TextRange(int start, int end) {
/*  37 */     return TextRange.constructor-impl(packWithCheck(start, end));
/*     */   }
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
/*     */   public static final long TextRange(int index) {
/* 100 */     return TextRange(index, index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long coerceIn-8ffj60Q(long $this$coerceIn_u2d8ffj60Q, int minimumValue, int maximumValue) {
/* 112 */     int newStart = RangesKt.coerceIn(TextRange.getStart-impl($this$coerceIn_u2d8ffj60Q), minimumValue, maximumValue);
/* 113 */     int newEnd = RangesKt.coerceIn(TextRange.getEnd-impl($this$coerceIn_u2d8ffj60Q), minimumValue, maximumValue);
/* 114 */     if (newStart != TextRange.getStart-impl($this$coerceIn_u2d8ffj60Q) || newEnd != TextRange.getEnd-impl($this$coerceIn_u2d8ffj60Q)) {
/* 115 */       return TextRange(newStart, newEnd);
/*     */     }
/* 117 */     return $this$coerceIn_u2d8ffj60Q;
/*     */   }
/*     */   
/*     */   private static final long packWithCheck(int start, int end) {
/* 121 */     if (!((start >= 0) ? 1 : 0)) { int $i$a$-require-TextRangeKt$packWithCheck$1 = 0; String str = 
/* 122 */         "start cannot be negative. [start: " + start + ", end: " + end + ']'; throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 124 */     if (!((end >= 0) ? 1 : 0)) { int $i$a$-require-TextRangeKt$packWithCheck$2 = 0; String str = 
/* 125 */         "end cannot be negative. [start: " + start + ", end: " + end + ']'; throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 127 */     int $i$f$packInts = 0; return 
/*     */ 
/*     */       
/* 130 */       start << 32L | end & 0xFFFFFFFFL;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextRangeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */