/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ULong;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.state.CommonStateBitMask;
/*     */ import org.jetbrains.jewel.foundation.state.FocusableComponentState;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\r\n\002\020\016\n\002\b\023\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\004\b@\030\000 32\0020\001:\0013B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\017\020\027\032\0020\030H\026¢\006\004\b\031\020\032JI\020\033\032\0020\0002\b\b\002\020\034\032\0020\n2\b\b\002\020\035\032\0020\n2\b\b\002\020\036\032\0020\n2\b\b\002\020\037\032\0020\n2\b\b\002\020 \032\0020\n2\b\b\002\020!\032\0020\n¢\006\004\b\"\020#JM\020$\032\002H%\"\004\b\000\020%2\006\020&\032\002H%2\006\020'\032\002H%2\006\020\035\032\002H%2\006\020\037\032\002H%2\006\020 \032\002H%2\006\020\036\032\002H%2\006\020!\032\002H%H\007¢\006\004\b(\020)J\032\020*\032\0020\n2\b\020+\032\004\030\0010,HÖ\003¢\006\004\b-\020.J\020\020/\032\00200HÖ\001¢\006\004\b1\0202R\023\020\002\032\0020\003¢\006\n\n\002\020\b\032\004\b\006\020\007R\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\024\020\r\032\0020\n8VX\004¢\006\006\032\004\b\016\020\fR\024\020\017\032\0020\n8VX\004¢\006\006\032\004\b\020\020\fR\021\020\021\032\0020\n8F¢\006\006\032\004\b\022\020\fR\024\020\023\032\0020\n8VX\004¢\006\006\032\004\b\024\020\fR\024\020\025\032\0020\n8VX\004¢\006\006\032\004\b\026\020\f\001\002¨\0064"}, d2 = {"Lorg/jetbrains/jewel/ui/component/LinkState;", "Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;", "state", "Lkotlin/ULong;", "constructor-impl", "(J)J", "getState-s-VKNKU", "()J", "J", "isActive", "", "isActive-impl", "(J)Z", "isEnabled", "isEnabled-impl", "isFocused", "isFocused-impl", "isVisited", "isVisited-impl", "isPressed", "isPressed-impl", "isHovered", "isHovered-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "copy", "enabled", "focused", "visited", "pressed", "hovered", "active", "copy-oSacjZw", "(JZZZZZZ)J", "chooseValueWithVisited", "T", "normal", "disabled", "chooseValueWithVisited-impl", "(JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "equals", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "Companion", "ui"})
/*     */ @Immutable
/*     */ public final class LinkState
/*     */   implements FocusableComponentState
/*     */ {
/*     */   @Composable
/*     */   public static <T> T chooseValue-impl(long arg0, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) {
/* 239 */     return box-impl(arg0).chooseValue((T)normal, (T)disabled, (T)focused, (T)pressed, (T)hovered, (T)active, $composer, $changed); } @Composable public <T> T chooseValue(Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) { return (T)FocusableComponentState.DefaultImpls.chooseValue(this, normal, disabled, focused, pressed, hovered, active, $composer, $changed); }
/*     */    public final long getState-s-VKNKU() {
/* 241 */     return this.state;
/*     */   }
/* 243 */   public static boolean isActive-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getActive-s-VKNKU()) != 0L); } public boolean isActive() { return isActive-impl(this.state); }
/*     */ 
/*     */   
/* 246 */   public static boolean isEnabled-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU()) != 0L); } public boolean isEnabled() { return isEnabled-impl(this.state); }
/*     */ 
/*     */   
/* 249 */   public static boolean isFocused-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getFocused-s-VKNKU()) != 0L); } public boolean isFocused() { return isFocused-impl(this.state); }
/*     */   
/*     */   public static final boolean isVisited-impl(long arg0) {
/* 252 */     return (ULong.constructor-impl(arg0 & Visited) != 0L);
/*     */   }
/*     */   
/* 255 */   public static boolean isPressed-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getPressed-s-VKNKU()) != 0L); } public boolean isPressed() { return isPressed-impl(this.state); }
/*     */ 
/*     */   
/* 258 */   public static boolean isHovered-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getHovered-s-VKNKU()) != 0L); } public boolean isHovered() { return isHovered-impl(this.state); }
/*     */   @NotNull
/* 260 */   public String toString() { return toString-impl(this.state); } @NotNull
/* 261 */   public static String toString-impl(long arg0) { return box-impl(arg0).getClass().getSimpleName() + "(enabled=" + box-impl(arg0).getClass().getSimpleName() + ", focused=" + isEnabled-impl(arg0) + ", visited=" + isFocused-impl(arg0) + ", pressed=" + isVisited-impl(arg0) + ", hovered=" + 
/* 262 */       isPressed-impl(arg0) + ", isActive=" + isHovered-impl(arg0) + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long copy-oSacjZw(long arg0, boolean enabled, boolean focused, boolean visited, boolean pressed, boolean hovered, boolean active) {
/* 272 */     return Companion.of-oSacjZw(
/* 273 */         enabled, 
/* 274 */         focused, 
/* 275 */         visited, 
/*     */         
/* 277 */         hovered, pressed, 
/* 278 */         active);
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
/*     */   @Composable
/*     */   public static final <T> T chooseValueWithVisited-impl(long arg0, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object visited, Object active, @Nullable Composer $composer, int $changed) {
/* 291 */     $composer.startReplaceGroup(-920485139); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-920485139, $changed, -1, "org.jetbrains.jewel.ui.component.LinkState.chooseValueWithVisited (Link.kt:290)");
/*     */     
/* 293 */     $composer.startReplaceGroup(1013193604); boolean bool = (isPressed-impl(arg0) && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup();
/* 294 */     $composer.startReplaceGroup(1013248164); bool = (isHovered-impl(arg0) && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup(); Object object = !isEnabled-impl(arg0) ? disabled : (bool ? pressed : (bool ? hovered : (
/* 295 */       isFocused-impl(arg0) ? focused : (
/* 296 */       isVisited-impl(arg0) ? visited : (
/* 297 */       isActive-impl(arg0) ? active : 
/* 298 */       normal)))));
/*     */     if (ComposerKt.isTraceInProgress()) {
/*     */       ComposerKt.traceEventEnd();
/*     */     }
/*     */     $composer.endReplaceGroup();
/*     */     return (T)object;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\b\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JI\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\f2\b\b\002\020\016\032\0020\f2\b\b\002\020\017\032\0020\f2\b\b\002\020\020\032\0020\f2\b\b\002\020\021\032\0020\f¢\006\004\b\022\020\023R\016\020\004\032\0020\005XT¢\006\002\n\000R\020\020\006\032\0020\007X\004¢\006\004\n\002\020\b¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/ui/component/LinkState$Companion;", "", "<init>", "()V", "VISITED_BIT_OFFSET", "", "Visited", "Lkotlin/ULong;", "J", "of", "Lorg/jetbrains/jewel/ui/component/LinkState;", "enabled", "", "focused", "visited", "hovered", "pressed", "active", "of-oSacjZw", "(ZZZZZZ)J", "ui"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */     
/*     */     public final long of-oSacjZw(boolean enabled, boolean focused, boolean visited, boolean hovered, boolean pressed, boolean active) {
/* 314 */       return LinkState.constructor-impl(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 320 */           ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl((visited ? LinkState.Visited : 0L) | (enabled ? CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU() : 0L)) | (focused ? CommonStateBitMask.INSTANCE.getFocused-s-VKNKU() : 0L)) | (pressed ? CommonStateBitMask.INSTANCE.getPressed-s-VKNKU() : 0L)) | (hovered ? CommonStateBitMask.INSTANCE.getHovered-s-VKNKU() : 0L)) | (active ? CommonStateBitMask.INSTANCE.getActive-s-VKNKU() : 0L)));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long state;
/*     */   private static final int VISITED_BIT_OFFSET = 7;
/*     */   private static final long Visited = ULong.constructor-impl(1L << 7L);
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return ULong.hashCode-impl(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.state);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof LinkState))
/*     */       return false; 
/*     */     long l = ((LinkState)other).unbox-impl();
/*     */     return !(arg0 != l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.state, other);
/*     */   }
/*     */   
/*     */   public static long constructor-impl(long state) {
/*     */     return state;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return ULong.equals-impl0(p1, p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LinkState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */