/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\r\b\007\030\000 \0172\0020\001:\001\017B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bR\023\020\002\032\0020\003¢\006\n\n\002\020\013\032\004\b\t\020\nR\023\020\004\032\0020\003¢\006\n\n\002\020\013\032\004\b\f\020\nR\023\020\005\032\0020\003¢\006\n\n\002\020\013\032\004\b\r\020\nR\023\020\006\032\0020\003¢\006\n\n\002\020\013\032\004\b\016\020\n¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;", "", "track", "Landroidx/compose/ui/graphics/Color;", "progress", "indeterminateBase", "indeterminateHighlight", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTrack-0d7_KjU", "()J", "J", "getProgress-0d7_KjU", "getIndeterminateBase-0d7_KjU", "getIndeterminateHighlight-0d7_KjU", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class HorizontalProgressBarColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long track;
/*    */   private final long progress;
/*    */   private final long indeterminateBase;
/*    */   private final long indeterminateHighlight;
/*    */   public static final int $stable;
/*    */   
/*    */   private HorizontalProgressBarColors(long track, long progress, long indeterminateBase, long indeterminateHighlight) {
/* 25 */     this.track = track;
/* 26 */     this.progress = progress;
/* 27 */     this.indeterminateBase = indeterminateBase;
/* 28 */     this.indeterminateHighlight = indeterminateHighlight; } public final long getIndeterminateHighlight-0d7_KjU() { return this.indeterminateHighlight; }
/*    */ 
/*    */   
/*    */   public final long getTrack-0d7_KjU() {
/*    */     return this.track;
/*    */   }
/*    */   
/*    */   public final long getProgress-0d7_KjU() {
/*    */     return this.progress;
/*    */   }
/*    */   
/*    */   public final long getIndeterminateBase-0d7_KjU() {
/*    */     return this.indeterminateBase;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof HorizontalProgressBarColors))
/*    */       return false; 
/*    */     HorizontalProgressBarColors horizontalProgressBarColors = (HorizontalProgressBarColors)other;
/*    */     return !Color.equals-impl0(this.track, horizontalProgressBarColors.track) ? false : (!Color.equals-impl0(this.progress, horizontalProgressBarColors.progress) ? false : (!Color.equals-impl0(this.indeterminateBase, horizontalProgressBarColors.indeterminateBase) ? false : (!!Color.equals-impl0(this.indeterminateHighlight, horizontalProgressBarColors.indeterminateHighlight))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.track);
/*    */     result = result * 31 + Color.hashCode-impl(this.progress);
/*    */     result = result * 31 + Color.hashCode-impl(this.indeterminateBase);
/*    */     return result * 31 + Color.hashCode-impl(this.indeterminateHighlight);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "HorizontalProgressBarColors(track=" + Color.toString-impl(this.track) + ", progress=" + Color.toString-impl(this.progress) + ", indeterminateBase=" + Color.toString-impl(this.indeterminateBase) + ", indeterminateHighlight=" + Color.toString-impl(this.indeterminateHighlight) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\HorizontalProgressBarColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */