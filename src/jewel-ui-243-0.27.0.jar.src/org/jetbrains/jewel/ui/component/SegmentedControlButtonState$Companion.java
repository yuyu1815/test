/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ULong;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.jewel.foundation.state.CommonStateBitMask;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J=\020\004\032\0020\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\0072\b\b\002\020\n\032\0020\0072\b\b\002\020\013\032\0020\007¢\006\004\b\f\020\r¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState$Companion;", "", "<init>", "()V", "of", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState;", "selected", "", "enabled", "pressed", "hovered", "active", "of-Um8v6X4", "(ZZZZZ)J", "ui"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   public final long of-Um8v6X4(boolean selected, boolean enabled, boolean pressed, boolean hovered, boolean active) {
/* 162 */     return SegmentedControlButtonState.constructor-impl(
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 167 */         ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl(ULong.constructor-impl((selected ? CommonStateBitMask.INSTANCE.getSelected-s-VKNKU() : 0L) | (enabled ? CommonStateBitMask.INSTANCE.getEnabled-s-VKNKU() : 0L)) | (pressed ? CommonStateBitMask.INSTANCE.getPressed-s-VKNKU() : 0L)) | (hovered ? CommonStateBitMask.INSTANCE.getHovered-s-VKNKU() : 0L)) | (active ? CommonStateBitMask.INSTANCE.getActive-s-VKNKU() : 0L)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlButtonState$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */