/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.time.Duration;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\024\b\007\030\000 \0342\0020\001:\001\034BG\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\006\020\013\032\0020\t\022\006\020\f\032\0020\t¢\006\004\b\r\020\016R\026\020\002\032\0020\003X\004¢\006\n\n\002\020\021\032\004\b\017\020\020R\026\020\004\032\0020\003X\004¢\006\n\n\002\020\021\032\004\b\022\020\020R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\007\032\0020\006X\004¢\006\b\n\000\032\004\b\025\020\024R\026\020\b\032\0020\tX\004¢\006\n\n\002\020\030\032\004\b\026\020\027R\026\020\n\032\0020\tX\004¢\006\n\n\002\020\030\032\004\b\031\020\027R\026\020\013\032\0020\tX\004¢\006\n\n\002\020\030\032\004\b\032\020\027R\026\020\f\032\0020\tX\004¢\006\n\n\002\020\030\032\004\b\033\020\027¨\006\035"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling;", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "trackThickness", "Landroidx/compose/ui/unit/Dp;", "trackThicknessExpanded", "trackPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "trackPaddingWithBorder", "trackColorAnimationDuration", "Lkotlin/time/Duration;", "expandAnimationDuration", "thumbColorAnimationDuration", "lingerDuration", "<init>", "(FFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTrackThickness-D9Ej5fM", "()F", "F", "getTrackThicknessExpanded-D9Ej5fM", "getTrackPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getTrackPaddingWithBorder", "getTrackColorAnimationDuration-UwyO8pc", "()J", "J", "getExpandAnimationDuration-UwyO8pc", "getThumbColorAnimationDuration-UwyO8pc", "getLingerDuration-UwyO8pc", "Companion", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class WhenScrolling
/*    */   implements ScrollbarVisibility
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float trackThickness;
/*    */   private final float trackThicknessExpanded;
/*    */   @NotNull
/*    */   private final PaddingValues trackPadding;
/*    */   @NotNull
/*    */   private final PaddingValues trackPaddingWithBorder;
/*    */   private final long trackColorAnimationDuration;
/*    */   private final long expandAnimationDuration;
/*    */   private final long thumbColorAnimationDuration;
/*    */   private final long lingerDuration;
/*    */   public static final int $stable;
/*    */   
/*    */   private WhenScrolling(float trackThickness, float trackThicknessExpanded, PaddingValues trackPadding, PaddingValues trackPaddingWithBorder, long trackColorAnimationDuration, long expandAnimationDuration, long thumbColorAnimationDuration, long lingerDuration) {
/* 80 */     this.trackThickness = trackThickness;
/* 81 */     this.trackThicknessExpanded = trackThicknessExpanded;
/* 82 */     this.trackPadding = trackPadding;
/* 83 */     this.trackPaddingWithBorder = trackPaddingWithBorder;
/* 84 */     this.trackColorAnimationDuration = trackColorAnimationDuration;
/* 85 */     this.expandAnimationDuration = expandAnimationDuration;
/* 86 */     this.thumbColorAnimationDuration = thumbColorAnimationDuration;
/* 87 */     this.lingerDuration = lingerDuration; } public long getLingerDuration-UwyO8pc() { return this.lingerDuration; }
/*    */ 
/*    */   
/*    */   public float getTrackThickness-D9Ej5fM() {
/*    */     return this.trackThickness;
/*    */   }
/*    */   
/*    */   public float getTrackThicknessExpanded-D9Ej5fM() {
/*    */     return this.trackThicknessExpanded;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PaddingValues getTrackPadding() {
/*    */     return this.trackPadding;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PaddingValues getTrackPaddingWithBorder() {
/*    */     return this.trackPaddingWithBorder;
/*    */   }
/*    */   
/*    */   public long getTrackColorAnimationDuration-UwyO8pc() {
/*    */     return this.trackColorAnimationDuration;
/*    */   }
/*    */   
/*    */   public long getExpandAnimationDuration-UwyO8pc() {
/*    */     return this.expandAnimationDuration;
/*    */   }
/*    */   
/*    */   public long getThumbColorAnimationDuration-UwyO8pc() {
/*    */     return this.thumbColorAnimationDuration;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof WhenScrolling))
/*    */       return false; 
/*    */     WhenScrolling whenScrolling = (WhenScrolling)other;
/*    */     return !Dp.equals-impl0(this.trackThickness, whenScrolling.trackThickness) ? false : (!Dp.equals-impl0(this.trackThicknessExpanded, whenScrolling.trackThicknessExpanded) ? false : (!Intrinsics.areEqual(this.trackPadding, whenScrolling.trackPadding) ? false : (!Intrinsics.areEqual(this.trackPaddingWithBorder, whenScrolling.trackPaddingWithBorder) ? false : (!Duration.equals-impl0(this.trackColorAnimationDuration, whenScrolling.trackColorAnimationDuration) ? false : (!Duration.equals-impl0(this.expandAnimationDuration, whenScrolling.expandAnimationDuration) ? false : (!Duration.equals-impl0(this.thumbColorAnimationDuration, whenScrolling.thumbColorAnimationDuration) ? false : (!!Duration.equals-impl0(this.lingerDuration, whenScrolling.lingerDuration))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.trackThickness);
/*    */     result = result * 31 + Dp.hashCode-impl(this.trackThicknessExpanded);
/*    */     result = result * 31 + this.trackPadding.hashCode();
/*    */     result = result * 31 + this.trackPaddingWithBorder.hashCode();
/*    */     result = result * 31 + Duration.hashCode-impl(this.trackColorAnimationDuration);
/*    */     result = result * 31 + Duration.hashCode-impl(this.expandAnimationDuration);
/*    */     result = result * 31 + Duration.hashCode-impl(this.thumbColorAnimationDuration);
/*    */     return result * 31 + Duration.hashCode-impl(this.lingerDuration);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "WhenScrolling(trackThickness=" + Dp.toString-impl(this.trackThickness) + ", trackThicknessExpanded=" + Dp.toString-impl(this.trackThicknessExpanded) + ", trackPadding=" + this.trackPadding + ", trackPaddingWithBorder=" + this.trackPaddingWithBorder + ", trackColorAnimationDuration=" + Duration.toString-impl(this.trackColorAnimationDuration) + ", expandAnimationDuration=" + Duration.toString-impl(this.expandAnimationDuration) + ", thumbColorAnimationDuration=" + Duration.toString-impl(this.thumbColorAnimationDuration) + ", lingerDuration=" + Duration.toString-impl(this.lingerDuration) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ScrollbarVisibility$WhenScrolling.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */