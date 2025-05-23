/*    */ package org.jetbrains.jewel.ui.component;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\007\n\002\020\002\n\002\b\016\b\007\030\0002\0020\001B'\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\n\b\002\020\006\032\004\030\0010\000¢\006\004\b\007\020\bJ\025\020\f\032\0020\r2\006\020\016\032\0020\005H\000¢\006\002\b\017J\035\020\020\032\0020\r2\006\020\021\032\0020\0042\006\020\022\032\0020\005¢\006\004\b\023\020\024J\025\020\025\032\0020\0052\006\020\021\032\0020\004¢\006\004\b\026\020\027J\006\020\030\032\0020\005J\006\020\031\032\0020\005J\032\020\032\032\0020\0002\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\t\020\nR\020\020\006\032\004\030\0010\000X\004¢\006\002\n\000R\016\020\013\032\0020\005X\016¢\006\002\n\000¨\006\033"}, d2 = {"Lorg/jetbrains/jewel/ui/component/MenuManager;", "", "onDismissRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/input/InputMode;", "", "parentMenuManager", "<init>", "(Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/MenuManager;)V", "getOnDismissRequest", "()Lkotlin/jvm/functions/Function1;", "isHovered", "onHoveredChange", "", "hovered", "onHoveredChange$ui", "closeAll", "mode", "force", "closeAll-HMVJIwE", "(IZ)V", "close", "close-iuPiT84", "(I)Z", "isRootMenu", "isSubmenu", "submenuManager", "ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class MenuManager {
/*    */   @NotNull
/*    */   private final Function1<InputMode, Boolean> onDismissRequest;
/*    */   
/*    */   public MenuManager(@NotNull Function1<InputMode, Boolean> onDismissRequest, @Nullable MenuManager parentMenuManager) {
/*  8 */     this.onDismissRequest = onDismissRequest;
/*  9 */     this.parentMenuManager = parentMenuManager;
/*    */   }
/*    */   @Nullable
/*    */   private final MenuManager parentMenuManager; private boolean isHovered; public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public final Function1<InputMode, Boolean> getOnDismissRequest() {
/*    */     return this.onDismissRequest;
/*    */   }
/*    */   
/*    */   public final void onHoveredChange$ui(boolean hovered) {
/* 20 */     this.isHovered = hovered;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void closeAll-HMVJIwE(int mode, boolean force)
/*    */   {
/* 31 */     if (!force && InputMode.equals-impl0(mode, InputMode.Companion.getTouch-aOaMEAU()) && this.isHovered)
/*    */       return; 
/* 33 */     if (((Boolean)this.onDismissRequest.invoke(InputMode.box-impl(mode))).booleanValue())
/* 34 */       if (this.parentMenuManager != null) { this.parentMenuManager.closeAll-HMVJIwE(mode, force); }
/*    */       else
/*    */       {  }
/*    */         } public final boolean close-iuPiT84(int mode) {
/* 38 */     return ((Boolean)this.onDismissRequest.invoke(InputMode.box-impl(mode))).booleanValue();
/*    */   } public final boolean isRootMenu() {
/* 40 */     return (this.parentMenuManager == null);
/*    */   } public final boolean isSubmenu() {
/* 42 */     return (this.parentMenuManager != null);
/*    */   } @NotNull
/*    */   public final MenuManager submenuManager(@NotNull Function1<? super InputMode, Boolean> onDismissRequest) {
/* 45 */     Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest"); return new MenuManager(onDismissRequest, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */