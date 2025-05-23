/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.state.ToggleableState;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ULong;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.state.CommonStateBitMask;
/*     */ import org.jetbrains.jewel.foundation.state.FocusableComponentState;
/*     */ import org.jetbrains.jewel.foundation.state.ToggleableComponentState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\023\n\002\020\016\n\002\b\004\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\004\b@\030\000 -2\0020\0012\0020\002:\001-B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006JI\020\030\032\0020\0002\b\b\002\020\b\032\0020\t2\b\b\002\020\031\032\0020\r2\b\b\002\020\032\032\0020\r2\b\b\002\020\033\032\0020\r2\b\b\002\020\034\032\0020\r2\b\b\002\020\035\032\0020\r¢\006\004\b\036\020\037J\017\020 \032\0020!H\026¢\006\004\b\"\020#J\032\020$\032\0020\r2\b\020%\032\004\030\0010&HÖ\003¢\006\004\b'\020(J\020\020)\032\0020*HÖ\001¢\006\004\b+\020,R\020\020\003\032\0020\004X\004¢\006\004\n\002\020\007R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017R\024\020\022\032\0020\r8VX\004¢\006\006\032\004\b\023\020\017R\024\020\024\032\0020\r8VX\004¢\006\006\032\004\b\025\020\017R\024\020\026\032\0020\r8VX\004¢\006\006\032\004\b\027\020\017\001\003\001\0020\004¨\006."}, d2 = {"Lorg/jetbrains/jewel/ui/component/CheckboxState;", "Lorg/jetbrains/jewel/foundation/state/ToggleableComponentState;", "Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;", "state", "Lkotlin/ULong;", "constructor-impl", "(J)J", "J", "toggleableState", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState-impl", "(J)Landroidx/compose/ui/state/ToggleableState;", "isEnabled", "", "isEnabled-impl", "(J)Z", "isActive", "isActive-impl", "isFocused", "isFocused-impl", "isHovered", "isHovered-impl", "isPressed", "isPressed-impl", "copy", "enabled", "focused", "pressed", "hovered", "active", "copy-oOgqrko", "(JLandroidx/compose/ui/state/ToggleableState;ZZZZZ)J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "Companion", "ui"})
/*     */ @Immutable
/*     */ public final class CheckboxState
/*     */   implements ToggleableComponentState, FocusableComponentState
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long state;
/*     */   
/*     */   public static boolean isSelected-impl(long arg0) {
/* 363 */     return box-impl(arg0).isSelected(); } public boolean isSelected() { return ToggleableComponentState.DefaultImpls.isSelected(this); } public static boolean isSelectedOrIndeterminate-impl(long arg0) { return box-impl(arg0).isSelectedOrIndeterminate(); } public boolean isSelectedOrIndeterminate() { return ToggleableComponentState.DefaultImpls.isSelectedOrIndeterminate(this); } @Composable public static <T> T chooseValue-impl(long arg0, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) { return box-impl(arg0).chooseValue((T)normal, (T)disabled, (T)focused, (T)pressed, (T)hovered, (T)active, $composer, $changed); } @Composable public <T> T chooseValue(Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) { return (T)FocusableComponentState.DefaultImpls.chooseValue(this, normal, disabled, focused, pressed, hovered, active, $composer, $changed); }
/*     */ 
/*     */   
/*     */   @NotNull
/* 367 */   public static ToggleableState getToggleableState-impl(long arg0) { return ToggleableComponentState.Companion.readToggleableState-VKZWuLQ(arg0); } @NotNull public ToggleableState getToggleableState() { return getToggleableState-impl(this.state); }
/*     */ 
/*     */   
/* 370 */   public static boolean isEnabled-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU()) != 0L); } public boolean isEnabled() { return isEnabled-impl(this.state); }
/*     */ 
/*     */   
/* 373 */   public static boolean isActive-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getActive-s-VKNKU()) != 0L); } public boolean isActive() { return isActive-impl(this.state); }
/*     */ 
/*     */   
/* 376 */   public static boolean isFocused-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getFocused-s-VKNKU()) != 0L); } public boolean isFocused() { return isFocused-impl(this.state); }
/*     */ 
/*     */   
/* 379 */   public static boolean isHovered-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getHovered-s-VKNKU()) != 0L); } public boolean isHovered() { return isHovered-impl(this.state); }
/*     */ 
/*     */   
/* 382 */   public static boolean isPressed-impl(long arg0) { return (ULong.constructor-impl(arg0 & CommonStateBitMask.INSTANCE.getPressed-s-VKNKU()) != 0L); } public boolean isPressed() { return isPressed-impl(this.state); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long copy-oOgqrko(long arg0, @NotNull ToggleableState toggleableState, boolean enabled, boolean focused, boolean pressed, boolean hovered, boolean active) {
/* 392 */     Intrinsics.checkNotNullParameter(toggleableState, "toggleableState"); return Companion.of-oOgqrko(
/* 393 */         toggleableState, 
/* 394 */         enabled, 
/* 395 */         focused, 
/* 396 */         pressed, 
/* 397 */         hovered, 
/* 398 */         active);
/*     */   }
/*     */   public static int hashCode-impl(long arg0) { return ULong.hashCode-impl(arg0); } public int hashCode() { return hashCode-impl(this.state); } @NotNull
/* 401 */   public String toString() { return toString-impl(this.state); }
/* 402 */   public static boolean equals-impl(long arg0, Object other) { if (!(other instanceof CheckboxState)) return false;  long l = ((CheckboxState)other).unbox-impl(); return !(arg0 != l); } @NotNull public static String toString-impl(long arg0) { return box-impl(arg0).getClass().getSimpleName() + "(toggleableState=" + box-impl(arg0).getClass().getSimpleName() + ", isEnabled=" + getToggleableState-impl(arg0) + ", isFocused=" + isEnabled-impl(arg0) + ", isHovered=" + isFocused-impl(arg0) + ", isPressed=" + 
/* 403 */       isHovered-impl(arg0) + ", isActive=" + isPressed-impl(arg0) + ")"; }
/*     */    public boolean equals(Object other) {
/*     */     return equals-impl(this.state, other);
/*     */   }
/*     */   public static long constructor-impl(long state) {
/*     */     return state;
/*     */   }
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return ULong.equals-impl0(p1, p2);
/*     */   }
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JG\020\004\032\0020\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\t2\b\b\002\020\013\032\0020\t2\b\b\002\020\f\032\0020\t2\b\b\002\020\r\032\0020\t¢\006\004\b\016\020\017¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/ui/component/CheckboxState$Companion;", "", "<init>", "()V", "of", "Lorg/jetbrains/jewel/ui/component/CheckboxState;", "toggleableState", "Landroidx/compose/ui/state/ToggleableState;", "enabled", "", "focused", "pressed", "hovered", "active", "of-oOgqrko", "(Landroidx/compose/ui/state/ToggleableState;ZZZZZ)J", "ui"})
/*     */   public static final class Companion { public final long of-oOgqrko(@NotNull ToggleableState toggleableState, boolean enabled, boolean focused, boolean pressed, boolean hovered, boolean active) {
/* 415 */       Intrinsics.checkNotNullParameter(toggleableState, "toggleableState");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 421 */       return CheckboxState.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl((enabled ? CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU() : 0L) | (focused ? CommonStateBitMask.INSTANCE.getFocused-s-VKNKU() : 0L)) | (hovered ? CommonStateBitMask.INSTANCE.getHovered-s-VKNKU() : 0L)) | (pressed ? CommonStateBitMask.INSTANCE.getPressed-s-VKNKU() : 0L)) | ((toggleableState != ToggleableState.Off) ? CommonStateBitMask.INSTANCE.getSelected-s-VKNKU() : 0L)) | ((toggleableState == ToggleableState.Indeterminate) ? CommonStateBitMask.INSTANCE.getIndeterminate-s-VKNKU() : 0L)) | (active ? CommonStateBitMask.INSTANCE.getActive-s-VKNKU() : 0L)));
/*     */     }
/*     */     
/*     */     private Companion() {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CheckboxState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */