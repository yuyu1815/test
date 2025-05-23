/*    */ package org.jetbrains.jewel.foundation.state;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\020\n\002\020\b\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\023\020\004\032\0020\005¢\006\n\n\002\020\b\032\004\b\006\020\007R\023\020\t\032\0020\005¢\006\n\n\002\020\b\032\004\b\n\020\007R\023\020\013\032\0020\005¢\006\n\n\002\020\b\032\004\b\f\020\007R\023\020\r\032\0020\005¢\006\n\n\002\020\b\032\004\b\016\020\007R\023\020\017\032\0020\005¢\006\n\n\002\020\b\032\004\b\020\020\007R\023\020\021\032\0020\005¢\006\n\n\002\020\b\032\004\b\022\020\007R\023\020\023\032\0020\005¢\006\n\n\002\020\b\032\004\b\024\020\007R\016\020\025\032\0020\026XT¢\006\002\n\000¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/foundation/state/CommonStateBitMask;", "", "<init>", "()V", "Enabled", "Lkotlin/ULong;", "getEnabled-s-VKNKU", "()J", "J", "Focused", "getFocused-s-VKNKU", "Hovered", "getHovered-s-VKNKU", "Pressed", "getPressed-s-VKNKU", "Active", "getActive-s-VKNKU", "Selected", "getSelected-s-VKNKU", "Indeterminate", "getIndeterminate-s-VKNKU", "FIRST_AVAILABLE_OFFSET", "", "foundation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class CommonStateBitMask { @NotNull
/*  4 */   public static final CommonStateBitMask INSTANCE = new CommonStateBitMask(); private static final long Enabled = ULong.constructor-impl(1L << 0L); public final long getEnabled-s-VKNKU() { return Enabled; }
/*  5 */    private static final long Focused = ULong.constructor-impl(1L << 1L); public final long getFocused-s-VKNKU() { return Focused; }
/*  6 */    private static final long Hovered = ULong.constructor-impl(1L << 2L); public final long getHovered-s-VKNKU() { return Hovered; }
/*  7 */    private static final long Pressed = ULong.constructor-impl(1L << 3L); public final long getPressed-s-VKNKU() { return Pressed; }
/*  8 */    private static final long Active = ULong.constructor-impl(1L << 4L); public final long getActive-s-VKNKU() { return Active; }
/*  9 */    private static final long Selected = ULong.constructor-impl(1L << 5L); public final long getSelected-s-VKNKU() { return Selected; }
/* 10 */    private static final long Indeterminate = ULong.constructor-impl(1L << 6L); public static final int FIRST_AVAILABLE_OFFSET = 7; public static final int $stable; public final long getIndeterminate-s-VKNKU() { return Indeterminate; }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\state\CommonStateBitMask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */