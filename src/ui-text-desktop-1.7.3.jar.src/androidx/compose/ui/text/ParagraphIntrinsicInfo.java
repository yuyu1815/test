/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\005HÆ\003J\t\020\017\032\0020\005HÆ\003J'\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\005HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\t¨\006\027"}, d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "intrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "startIndex", "", "endIndex", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)V", "getEndIndex", "()I", "getIntrinsics", "()Landroidx/compose/ui/text/ParagraphIntrinsics;", "getStartIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ParagraphIntrinsicInfo
/*     */ {
/*     */   @NotNull
/*     */   private final ParagraphIntrinsics intrinsics;
/*     */   private final int startIndex;
/*     */   private final int endIndex;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ParagraphIntrinsicInfo(@NotNull ParagraphIntrinsics intrinsics, int startIndex, int endIndex) {
/* 150 */     this.intrinsics = intrinsics;
/* 151 */     this.startIndex = startIndex;
/* 152 */     this.endIndex = endIndex; } public final int getEndIndex() { return this.endIndex; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ParagraphIntrinsics getIntrinsics() {
/*     */     return this.intrinsics;
/*     */   }
/*     */   
/*     */   public final int getStartIndex() {
/*     */     return this.startIndex;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ParagraphIntrinsics component1() {
/*     */     return this.intrinsics;
/*     */   }
/*     */   
/*     */   public final int component2() {
/*     */     return this.startIndex;
/*     */   }
/*     */   
/*     */   public final int component3() {
/*     */     return this.endIndex;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ParagraphIntrinsicInfo copy(@NotNull ParagraphIntrinsics intrinsics, int startIndex, int endIndex) {
/*     */     Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
/*     */     return new ParagraphIntrinsicInfo(intrinsics, startIndex, endIndex);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.intrinsics.hashCode();
/*     */     result = result * 31 + Integer.hashCode(this.startIndex);
/*     */     return result * 31 + Integer.hashCode(this.endIndex);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ParagraphIntrinsicInfo))
/*     */       return false; 
/*     */     ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo)other;
/*     */     return !Intrinsics.areEqual(this.intrinsics, paragraphIntrinsicInfo.intrinsics) ? false : ((this.startIndex != paragraphIntrinsicInfo.startIndex) ? false : (!(this.endIndex != paragraphIntrinsicInfo.endIndex)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ParagraphIntrinsicInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */