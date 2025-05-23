/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.RadioButtonState;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\020\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0312\0020\001:\001\031B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003¢\006\004\b\t\020\nJ\035\020\023\032\b\022\004\022\0020\0030\0242\006\020\025\032\0020\026H\007¢\006\004\b\027\020\030R\023\020\002\032\0020\003¢\006\n\n\002\020\r\032\004\b\013\020\fR\023\020\004\032\0020\003¢\006\n\n\002\020\r\032\004\b\016\020\fR\023\020\005\032\0020\003¢\006\n\n\002\020\r\032\004\b\017\020\fR\023\020\006\032\0020\003¢\006\n\n\002\020\r\032\004\b\020\020\fR\023\020\007\032\0020\003¢\006\n\n\002\020\r\032\004\b\021\020\fR\023\020\b\032\0020\003¢\006\n\n\002\020\r\032\004\b\022\020\f¨\006\032"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/RadioButtonColors;", "", "content", "Landroidx/compose/ui/graphics/Color;", "contentHovered", "contentDisabled", "contentSelected", "contentSelectedHovered", "contentSelectedDisabled", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContent-0d7_KjU", "()J", "J", "getContentHovered-0d7_KjU", "getContentDisabled-0d7_KjU", "getContentSelected-0d7_KjU", "getContentSelectedHovered-0d7_KjU", "getContentSelectedDisabled-0d7_KjU", "contentFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/RadioButtonState;", "contentFor-ehnS_G0", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class RadioButtonColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long content;
/*    */   private final long contentHovered;
/*    */   private final long contentDisabled;
/*    */   private final long contentSelected;
/*    */   private final long contentSelectedHovered;
/*    */   private final long contentSelectedDisabled;
/*    */   public static final int $stable;
/*    */   
/* 29 */   private RadioButtonColors(long content, long contentHovered, long contentDisabled, long contentSelected, long contentSelectedHovered, long contentSelectedDisabled) { this.content = content;
/* 30 */     this.contentHovered = contentHovered;
/* 31 */     this.contentDisabled = contentDisabled;
/* 32 */     this.contentSelected = contentSelected;
/* 33 */     this.contentSelectedHovered = contentSelectedHovered;
/* 34 */     this.contentSelectedDisabled = contentSelectedDisabled; } public final long getContent-0d7_KjU() { return this.content; } public final long getContentHovered-0d7_KjU() { return this.contentHovered; } public final long getContentSelectedDisabled-0d7_KjU() { return this.contentSelectedDisabled; }
/*    */   public final long getContentDisabled-0d7_KjU() { return this.contentDisabled; }
/*    */   public final long getContentSelected-0d7_KjU() { return this.contentSelected; }
/*    */   public final long getContentSelectedHovered-0d7_KjU() { return this.contentSelectedHovered; } @Composable @NotNull
/* 38 */   public final State<Color> contentFor-ehnS_G0(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-47880349); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-47880349, $changed, -1, "org.jetbrains.jewel.ui.component.styling.RadioButtonColors.contentFor (RadioButtonStyling.kt:37)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 45 */         Color.box-impl((!RadioButtonState.isEnabled-impl(state) && RadioButtonState.isSelected-impl(state)) ? this.contentSelectedDisabled : (!RadioButtonState.isEnabled-impl(state) ? this.contentDisabled : ((RadioButtonState.isSelected-impl(state) && RadioButtonState.isHovered-impl(state)) ? this.contentSelectedHovered : (RadioButtonState.isSelected-impl(state) ? this.contentSelected : (RadioButtonState.isHovered-impl(state) ? this.contentHovered : this.content))))), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RadioButtonColors))
/*    */       return false; 
/*    */     RadioButtonColors radioButtonColors = (RadioButtonColors)other;
/*    */     return !Color.equals-impl0(this.content, radioButtonColors.content) ? false : (!Color.equals-impl0(this.contentHovered, radioButtonColors.contentHovered) ? false : (!Color.equals-impl0(this.contentDisabled, radioButtonColors.contentDisabled) ? false : (!Color.equals-impl0(this.contentSelected, radioButtonColors.contentSelected) ? false : (!Color.equals-impl0(this.contentSelectedHovered, radioButtonColors.contentSelectedHovered) ? false : (!!Color.equals-impl0(this.contentSelectedDisabled, radioButtonColors.contentSelectedDisabled))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentHovered);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentSelected);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentSelectedHovered);
/*    */     return result * 31 + Color.hashCode-impl(this.contentSelectedDisabled);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RadioButtonColors(content=" + Color.toString-impl(this.content) + ", contentHovered=" + Color.toString-impl(this.contentHovered) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentSelected=" + Color.toString-impl(this.contentSelected) + ", contentSelectedHovered=" + Color.toString-impl(this.contentSelectedHovered) + ", contentSelectedDisabled=" + Color.toString-impl(this.contentSelectedDisabled) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/RadioButtonColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\RadioButtonColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */