/*    */ package androidx.compose.foundation.layout;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\033\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\025\020\002\032\0020\001*\0020\0038F¢\006\006\032\004\b\004\020\005\"\025\020\006\032\0020\001*\0020\0038F¢\006\006\032\004\b\007\020\005\"\025\020\b\032\0020\001*\0020\0038F¢\006\006\032\004\b\t\020\005\"\025\020\n\032\0020\001*\0020\0038F¢\006\006\032\004\b\013\020\005\"\025\020\f\032\0020\001*\0020\0038F¢\006\006\032\004\b\r\020\005\"\025\020\016\032\0020\001*\0020\0038F¢\006\006\032\004\b\017\020\005\"\025\020\020\032\0020\001*\0020\0038F¢\006\006\032\004\b\021\020\005\"\025\020\022\032\0020\001*\0020\0038F¢\006\006\032\004\b\023\020\005\"\025\020\024\032\0020\001*\0020\0038F¢\006\006\032\004\b\025\020\005\"\025\020\026\032\0020\001*\0020\0038F¢\006\006\032\004\b\027\020\005\"\025\020\030\032\0020\001*\0020\0038F¢\006\006\032\004\b\031\020\005\"\025\020\032\032\0020\001*\0020\0038F¢\006\006\032\004\b\033\020\005\"\025\020\034\032\0020\001*\0020\0038F¢\006\006\032\004\b\035\020\005¨\006\036"}, d2 = {"ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "captionBar", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "getCaptionBar", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;)Landroidx/compose/foundation/layout/WindowInsets;", "displayCutout", "getDisplayCutout", "ime", "getIme", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "safeContent", "getSafeContent", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "systemBars", "getSystemBars", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "waterfall", "getWaterfall", "foundation-layout"})
/*    */ public final class WindowInsets_notMobileKt
/*    */ {
/*    */   @NotNull
/* 19 */   private static final WindowInsets ZeroInsets = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
/*    */   @NotNull
/*    */   public static final WindowInsets getCaptionBar(@NotNull WindowInsets.Companion $this$captionBar) {
/* 22 */     Intrinsics.checkNotNullParameter($this$captionBar, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getDisplayCutout(@NotNull WindowInsets.Companion $this$displayCutout) {
/* 25 */     Intrinsics.checkNotNullParameter($this$displayCutout, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getIme(@NotNull WindowInsets.Companion $this$ime) {
/* 28 */     Intrinsics.checkNotNullParameter($this$ime, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getMandatorySystemGestures(@NotNull WindowInsets.Companion $this$mandatorySystemGestures) {
/* 31 */     Intrinsics.checkNotNullParameter($this$mandatorySystemGestures, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getNavigationBars(@NotNull WindowInsets.Companion $this$navigationBars) {
/* 34 */     Intrinsics.checkNotNullParameter($this$navigationBars, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getStatusBars(@NotNull WindowInsets.Companion $this$statusBars) {
/* 37 */     Intrinsics.checkNotNullParameter($this$statusBars, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getSystemBars(@NotNull WindowInsets.Companion $this$systemBars) {
/* 40 */     Intrinsics.checkNotNullParameter($this$systemBars, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getSystemGestures(@NotNull WindowInsets.Companion $this$systemGestures) {
/* 43 */     Intrinsics.checkNotNullParameter($this$systemGestures, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getTappableElement(@NotNull WindowInsets.Companion $this$tappableElement) {
/* 46 */     Intrinsics.checkNotNullParameter($this$tappableElement, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getWaterfall(@NotNull WindowInsets.Companion $this$waterfall) {
/* 49 */     Intrinsics.checkNotNullParameter($this$waterfall, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getSafeDrawing(@NotNull WindowInsets.Companion $this$safeDrawing) {
/* 52 */     Intrinsics.checkNotNullParameter($this$safeDrawing, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getSafeGestures(@NotNull WindowInsets.Companion $this$safeGestures) {
/* 55 */     Intrinsics.checkNotNullParameter($this$safeGestures, "<this>"); return ZeroInsets;
/*    */   } @NotNull
/*    */   public static final WindowInsets getSafeContent(@NotNull WindowInsets.Companion $this$safeContent) {
/* 58 */     Intrinsics.checkNotNullParameter($this$safeContent, "<this>"); return ZeroInsets;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\WindowInsets_notMobileKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */