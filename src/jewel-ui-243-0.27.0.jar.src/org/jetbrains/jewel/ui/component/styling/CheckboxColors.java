/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.state.ToggleableState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.CheckboxState;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0232\0020\001:\001\023B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007J\035\020\r\032\b\022\004\022\0020\0030\0162\006\020\017\032\0020\020H\007¢\006\004\b\021\020\022R\023\020\002\032\0020\003¢\006\n\n\002\020\n\032\004\b\b\020\tR\023\020\004\032\0020\003¢\006\n\n\002\020\n\032\004\b\013\020\tR\023\020\005\032\0020\003¢\006\n\n\002\020\n\032\004\b\f\020\t¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;", "", "content", "Landroidx/compose/ui/graphics/Color;", "contentDisabled", "contentSelected", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContent-0d7_KjU", "()J", "J", "getContentDisabled-0d7_KjU", "getContentSelected-0d7_KjU", "contentFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/CheckboxState;", "contentFor-f7CD9uA", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class CheckboxColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long content;
/*    */   private final long contentDisabled;
/*    */   private final long contentSelected;
/*    */   public static final int $stable;
/*    */   
/*    */   public final long getContent-0d7_KjU() {
/*    */     return this.content;
/*    */   }
/*    */   
/* 31 */   private CheckboxColors(long content, long contentDisabled, long contentSelected) { this.content = content;
/* 32 */     this.contentDisabled = contentDisabled;
/* 33 */     this.contentSelected = contentSelected; } public final long getContentSelected-0d7_KjU() { return this.contentSelected; }
/*    */   public final long getContentDisabled-0d7_KjU() { return this.contentDisabled; } @Composable
/*    */   @NotNull
/*    */   public final State<Color> contentFor-f7CD9uA(long state, @Nullable Composer $composer, int $changed) {
/* 37 */     $composer.startReplaceGroup(352932227); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(352932227, $changed, -1, "org.jetbrains.jewel.ui.component.styling.CheckboxColors.contentFor (CheckboxStyling.kt:36)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */ 
/*    */         
/* 41 */         Color.box-impl(!CheckboxState.isEnabled-impl(state) ? this.contentDisabled : ((CheckboxState.getToggleableState-impl(state) == ToggleableState.On) ? this.contentSelected : this.content)), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CheckboxColors))
/*    */       return false; 
/*    */     CheckboxColors checkboxColors = (CheckboxColors)other;
/*    */     return !Color.equals-impl0(this.content, checkboxColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, checkboxColors.contentDisabled) ? false : (!!Color.equals-impl0(this.contentSelected, checkboxColors.contentSelected)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*    */     return result * 31 + Color.hashCode-impl(this.contentSelected);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CheckboxColors(content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentSelected=" + Color.toString-impl(this.contentSelected) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\CheckboxColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */