/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\b\007\030\000 \0212\0020\001:\001\021B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\023\020\002\032\0020\003¢\006\n\n\002\020\f\032\004\b\n\020\013R\023\020\004\032\0020\003¢\006\n\n\002\020\f\032\004\b\r\020\013R\023\020\005\032\0020\003¢\006\n\n\002\020\f\032\004\b\016\020\013R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "border", "shadow", "itemColors", "Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;", "<init>", "(JJJLorg/jetbrains/jewel/ui/component/styling/MenuItemColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBorder-0d7_KjU", "getShadow-0d7_KjU", "getItemColors", "()Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class MenuColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long border;
/*    */   private final long shadow;
/*    */   @NotNull
/*    */   private final MenuItemColors itemColors;
/*    */   public static final int $stable;
/*    */   
/*    */   private MenuColors(long background, long border, long shadow, MenuItemColors itemColors) {
/* 33 */     this.background = background;
/* 34 */     this.border = border;
/* 35 */     this.shadow = shadow;
/* 36 */     this.itemColors = itemColors; } @NotNull public final MenuItemColors getItemColors() { return this.itemColors; }
/*    */ 
/*    */   
/*    */   public final long getBackground-0d7_KjU() {
/*    */     return this.background;
/*    */   }
/*    */   
/*    */   public final long getBorder-0d7_KjU() {
/*    */     return this.border;
/*    */   }
/*    */   
/*    */   public final long getShadow-0d7_KjU() {
/*    */     return this.shadow;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MenuColors))
/*    */       return false; 
/*    */     MenuColors menuColors = (MenuColors)other;
/*    */     return !Color.equals-impl0(this.background, menuColors.background) ? false : (!Color.equals-impl0(this.border, menuColors.border) ? false : (!Color.equals-impl0(this.shadow, menuColors.shadow) ? false : (!!Intrinsics.areEqual(this.itemColors, menuColors.itemColors))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
/*    */     result = result * 31 + Color.hashCode-impl(this.border);
/*    */     result = result * 31 + Color.hashCode-impl(this.shadow);
/*    */     return result * 31 + this.itemColors.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MenuColors(background=" + Color.toString-impl(this.background) + ", border=" + Color.toString-impl(this.border) + ", shadow=" + Color.toString-impl(this.shadow) + ", itemColors=" + this.itemColors + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\MenuColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */