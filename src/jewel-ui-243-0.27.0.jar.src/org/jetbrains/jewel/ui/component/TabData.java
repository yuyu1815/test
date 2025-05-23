/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\034\035B\t\b\004¢\006\004\b\002\020\003R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007R=\020\b\032-\022\004\022\0020\n\022\023\022\0210\013¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\0020\0170\t¢\006\002\b\020¢\006\002\b\021X¦\004¢\006\006\032\004\b\022\020\023R\022\020\024\032\0020\005X¦\004¢\006\006\032\004\b\025\020\007R\030\020\026\032\b\022\004\022\0020\0170\027X¦\004¢\006\006\032\004\b\030\020\031R\030\020\032\032\b\022\004\022\0020\0170\027X¦\004¢\006\006\032\004\b\033\020\031\001\002\036\037¨\006 "}, d2 = {"Lorg/jetbrains/jewel/ui/component/TabData;", "", "<init>", "()V", "selected", "", "getSelected", "()Z", "content", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/ui/component/TabContentScope;", "Lorg/jetbrains/jewel/ui/component/TabState;", "Lkotlin/ParameterName;", "name", "tabState", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function4;", "closable", "getClosable", "onClose", "Lkotlin/Function0;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "onClick", "getOnClick", "Default", "Editor", "Lorg/jetbrains/jewel/ui/component/TabData$Default;", "Lorg/jetbrains/jewel/ui/component/TabData$Editor;", "ui"})
/*     */ @Immutable
/*     */ public abstract class TabData
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   private TabData() {}
/*     */   
/*     */   public abstract boolean getSelected();
/*     */   
/*     */   @NotNull
/*     */   public abstract Function4<TabContentScope, TabState, Composer, Integer, Unit> getContent();
/*     */   
/*     */   public abstract boolean getClosable();
/*     */   
/*     */   @NotNull
/*     */   public abstract Function0<Unit> getOnClose();
/*     */   
/*     */   @NotNull
/*     */   public abstract Function0<Unit> getOnClick();
/*     */   
/*     */   @GenerateDataFunctions
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\b\007\030\0002\0020\001Bl\022\006\020\002\032\0020\003\0221\020\004\032-\022\004\022\0020\006\022\023\022\0210\007¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0130\005¢\006\002\b\f¢\006\002\b\r\022\b\b\002\020\016\032\0020\003\022\016\b\002\020\017\032\b\022\004\022\0020\0130\020\022\016\b\002\020\021\032\b\022\004\022\0020\0130\020¢\006\004\b\022\020\023R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\024\020\025RA\020\004\032-\022\004\022\0020\006\022\023\022\0210\007¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0130\005¢\006\002\b\f¢\006\002\b\rX\004¢\006\n\n\002\020\030\032\004\b\026\020\027R\024\020\016\032\0020\003X\004¢\006\b\n\000\032\004\b\031\020\025R\032\020\017\032\b\022\004\022\0020\0130\020X\004¢\006\b\n\000\032\004\b\032\020\033R\032\020\021\032\b\022\004\022\0020\0130\020X\004¢\006\b\n\000\032\004\b\034\020\033¨\006\035"}, d2 = {"Lorg/jetbrains/jewel/ui/component/TabData$Default;", "Lorg/jetbrains/jewel/ui/component/TabData;", "selected", "", "content", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/ui/component/TabContentScope;", "Lorg/jetbrains/jewel/ui/component/TabState;", "Lkotlin/ParameterName;", "name", "tabState", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "closable", "onClose", "Lkotlin/Function0;", "onClick", "<init>", "(ZLkotlin/jvm/functions/Function4;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSelected", "()Z", "getContent", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "getClosable", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "getOnClick", "ui"})
/*     */   @Immutable
/*     */   public static final class Default
/*     */     extends TabData
/*     */   {
/*     */     private final boolean selected;
/*     */     @NotNull
/*     */     private final Function4<TabContentScope, TabState, Composer, Integer, Unit> content;
/*     */     private final boolean closable;
/*     */     @NotNull
/*     */     private final Function0<Unit> onClose;
/*     */     @NotNull
/*     */     private final Function0<Unit> onClick;
/*     */     public static final int $stable;
/*     */     
/*     */     public boolean getSelected() {
/*  85 */       return this.selected; } @NotNull
/*  86 */     public Function4<TabContentScope, TabState, Composer, Integer, Unit> getContent() { return this.content; }
/*  87 */     public boolean getClosable() { return this.closable; } @NotNull
/*  88 */     public Function0<Unit> getOnClose() { return this.onClose; } private static final Unit _init_$lambda$0() { return Unit.INSTANCE; } @NotNull
/*  89 */     public Function0<Unit> getOnClick() { return this.onClick; } private static final Unit _init_$lambda$1() { return Unit.INSTANCE; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Default)) return false;  Default default_ = (Default)other; return (this.selected != default_.selected) ? false : (!Intrinsics.areEqual(this.content, default_.content) ? false : ((this.closable != default_.closable) ? false : (!Intrinsics.areEqual(this.onClose, default_.onClose) ? false : (!!Intrinsics.areEqual(this.onClick, default_.onClick))))); } public int hashCode() { result = Boolean.hashCode(this.selected); result = result * 31 + this.content.hashCode(); result = result * 31 + Boolean.hashCode(this.closable); result = result * 31 + this.onClose.hashCode(); return result * 31 + this.onClick.hashCode(); }
/*  90 */     public Default(boolean selected, @NotNull Function4<TabContentScope, TabState, Composer, Integer, Unit> content, boolean closable, @NotNull Function0<Unit> onClose, @NotNull Function0<Unit> onClick) { super(null); this.selected = selected;
/*     */       this.content = content;
/*     */       this.closable = closable;
/*     */       this.onClose = onClose;
/*     */       this.onClick = onClick; } @NotNull public String toString() { return "Default(selected=" + this.selected + ", content=" + this.content + ", closable=" + this.closable + ", onClose=" + this.onClose + ", onClick=" + this.onClick + ")"; }
/*  95 */   } @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\b\007\030\0002\0020\001Bl\022\006\020\002\032\0020\003\0221\020\004\032-\022\004\022\0020\006\022\023\022\0210\007¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0130\005¢\006\002\b\f¢\006\002\b\r\022\b\b\002\020\016\032\0020\003\022\016\b\002\020\017\032\b\022\004\022\0020\0130\020\022\016\b\002\020\021\032\b\022\004\022\0020\0130\020¢\006\004\b\022\020\023R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\024\020\025RA\020\004\032-\022\004\022\0020\006\022\023\022\0210\007¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0130\005¢\006\002\b\f¢\006\002\b\rX\004¢\006\n\n\002\020\030\032\004\b\026\020\027R\024\020\016\032\0020\003X\004¢\006\b\n\000\032\004\b\031\020\025R\032\020\017\032\b\022\004\022\0020\0130\020X\004¢\006\b\n\000\032\004\b\032\020\033R\032\020\021\032\b\022\004\022\0020\0130\020X\004¢\006\b\n\000\032\004\b\034\020\033¨\006\035"}, d2 = {"Lorg/jetbrains/jewel/ui/component/TabData$Editor;", "Lorg/jetbrains/jewel/ui/component/TabData;", "selected", "", "content", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/ui/component/TabContentScope;", "Lorg/jetbrains/jewel/ui/component/TabState;", "Lkotlin/ParameterName;", "name", "tabState", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "closable", "onClose", "Lkotlin/Function0;", "onClick", "<init>", "(ZLkotlin/jvm/functions/Function4;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSelected", "()Z", "getContent", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "getClosable", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "getOnClick", "ui"}) @Immutable public static final class Editor extends TabData { private final boolean selected; @NotNull private final Function4<TabContentScope, TabState, Composer, Integer, Unit> content; private final boolean closable; public boolean getSelected() { return this.selected; } @NotNull private final Function0<Unit> onClose; @NotNull private final Function0<Unit> onClick; public static final int $stable; @NotNull
/*  96 */     public Function4<TabContentScope, TabState, Composer, Integer, Unit> getContent() { return this.content; }
/*  97 */     public boolean getClosable() { return this.closable; } @NotNull
/*  98 */     public Function0<Unit> getOnClose() { return this.onClose; } private static final Unit _init_$lambda$0() { return Unit.INSTANCE; } @NotNull
/*  99 */     public Function0<Unit> getOnClick() { return this.onClick; } private static final Unit _init_$lambda$1() { return Unit.INSTANCE; } public Editor(boolean selected, @NotNull Function4<TabContentScope, TabState, Composer, Integer, Unit> content, boolean closable, @NotNull Function0<Unit> onClose, @NotNull Function0<Unit> onClick) {
/* 100 */       super(null);
/*     */       this.selected = selected;
/*     */       this.content = content;
/*     */       this.closable = closable;
/*     */       this.onClose = onClose;
/*     */       this.onClick = onClick;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Editor))
/*     */         return false; 
/*     */       Editor editor = (Editor)other;
/*     */       return (this.selected != editor.selected) ? false : (!Intrinsics.areEqual(this.content, editor.content) ? false : ((this.closable != editor.closable) ? false : (!Intrinsics.areEqual(this.onClose, editor.onClose) ? false : (!!Intrinsics.areEqual(this.onClick, editor.onClick)))));
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Boolean.hashCode(this.selected);
/*     */       result = result * 31 + this.content.hashCode();
/*     */       result = result * 31 + Boolean.hashCode(this.closable);
/*     */       result = result * 31 + this.onClose.hashCode();
/*     */       return result * 31 + this.onClick.hashCode();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Editor(selected=" + this.selected + ", content=" + this.content + ", closable=" + this.closable + ", onClose=" + this.onClose + ", onClick=" + this.onClick + ")";
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */