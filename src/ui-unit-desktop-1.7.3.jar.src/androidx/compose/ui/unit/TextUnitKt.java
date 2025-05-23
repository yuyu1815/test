/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.util.MathHelpersKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000F\n\000\n\002\020\t\n\002\b\004\n\002\030\002\n\002\020\006\n\002\b\004\n\002\020\007\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\r\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\024\n\002\030\002\n\002\b\b\032 \020\036\032\0020\0062\006\020\037\032\0020\f2\006\020 \032\0020!ø\001\000¢\006\004\b\"\020#\032\032\020$\032\0020%2\006\020&\032\0020\006H\001ø\001\000¢\006\004\b'\020\025\032\"\020$\032\0020%2\006\020&\032\0020\0062\006\020(\032\0020\006H\001ø\001\000¢\006\004\b)\020*\032*\020$\032\0020%2\006\020&\032\0020\0062\006\020(\032\0020\0062\006\020+\032\0020\006H\001ø\001\000¢\006\004\b,\020-\032*\020.\032\0020\0062\006\020/\032\0020\0062\006\0200\032\0020\0062\006\0201\032\0020\fH\007ø\001\000¢\006\004\b2\0203\032\035\0204\032\0020\0062\006\0205\032\0020\0012\006\0206\032\0020\fH\001¢\006\002\0207\032(\0208\032\0020\006*\0020\0062\f\0209\032\b\022\004\022\0020\0060:H\bø\001\001ø\001\000¢\006\004\b;\020<\032\037\020=\032\0020\006*\0020\0072\006\020>\032\0020\006H\nø\001\000¢\006\004\b?\020@\032\037\020=\032\0020\006*\0020\f2\006\020>\032\0020\006H\nø\001\000¢\006\004\b?\020#\032\037\020=\032\0020\006*\0020\0172\006\020>\032\0020\006H\nø\001\000¢\006\004\b?\020A\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\036\020\005\032\0020\006*\0020\0078FX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013\"\036\020\005\032\0020\006*\0020\f8FX\004¢\006\f\022\004\b\b\020\r\032\004\b\n\020\016\"\036\020\005\032\0020\006*\0020\0178FX\004¢\006\f\022\004\b\b\020\020\032\004\b\n\020\021\"\037\020\022\032\0020\023*\0020\0068Æ\002X\004¢\006\f\022\004\b\024\020\025\032\004\b\026\020\027\"\036\020\030\032\0020\023*\0020\0068FX\004¢\006\f\022\004\b\031\020\025\032\004\b\032\020\027\"\036\020\033\032\0020\006*\0020\0078FX\004¢\006\f\022\004\b\034\020\t\032\004\b\035\020\013\"\036\020\033\032\0020\006*\0020\f8FX\004¢\006\f\022\004\b\034\020\r\032\004\b\035\020\016\"\036\020\033\032\0020\006*\0020\0178FX\004¢\006\f\022\004\b\034\020\020\032\004\b\035\020\021\002\016\n\005\b¡\0360\001\n\005\b20\001¨\006B"}, d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", "type", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit"})
/*     */ @SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,389:1\n251#1:390\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n265#1:390\n*E\n"})
/*     */ public final class TextUnitKt
/*     */ {
/*     */   private static final long UNIT_MASK = 1095216660480L;
/*     */   private static final long UNIT_TYPE_UNSPECIFIED = 0L;
/*     */   private static final long UNIT_TYPE_SP = 4294967296L;
/*     */   private static final long UNIT_TYPE_EM = 8589934592L;
/*     */   
/*     */   public static final long TextUnit-anM5pPY(float value, long type) {
/*  70 */     return pack(type, value);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isSpecified--R2X_6o(long $this$isSpecified) {
/* 251 */     int $i$f$isSpecified--R2X_6o = 0; return !isUnspecified--R2X_6o($this$isSpecified);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isUnspecified--R2X_6o(long $this$isUnspecified) {
/* 258 */     return (TextUnit.getRawType-impl($this$isUnspecified) == 0L);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long takeOrElse-eAf_CNQ(long $this$takeOrElse_u2deAf_CNQ, @NotNull Function0 block) {
/* 265 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$takeOrElse-eAf_CNQ = 0; long $this$isSpecified$iv = $this$takeOrElse_u2deAf_CNQ; int $i$f$isSpecified--R2X_6o = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 390 */       !isUnspecified--R2X_6o($this$isSpecified$iv)) ? $this$takeOrElse_u2deAf_CNQ : ((TextUnit)block.invoke()).unbox-impl();
/*     */   }
/*     */   
/*     */   public static final long getSp(float $this$sp) {
/*     */     return pack(4294967296L, $this$sp);
/*     */   }
/*     */   
/*     */   public static final long getEm(float $this$em) {
/*     */     return pack(8589934592L, $this$em);
/*     */   }
/*     */   
/*     */   public static final long getSp(double $this$sp) {
/*     */     return pack(4294967296L, (float)$this$sp);
/*     */   }
/*     */   
/*     */   public static final long getEm(double $this$em) {
/*     */     return pack(8589934592L, (float)$this$em);
/*     */   }
/*     */   
/*     */   public static final long getSp(int $this$sp) {
/*     */     return pack(4294967296L, $this$sp);
/*     */   }
/*     */   
/*     */   public static final long getEm(int $this$em) {
/*     */     return pack(8589934592L, $this$em);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long times-mpE4wyQ(float $this$times_u2dmpE4wyQ, long other) {
/*     */     int $i$f$times-mpE4wyQ = 0;
/*     */     checkArithmetic--R2X_6o(other);
/*     */     return pack(TextUnit.getRawType-impl(other), $this$times_u2dmpE4wyQ * TextUnit.getValue-impl(other));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long times-mpE4wyQ(double $this$times_u2dmpE4wyQ, long other) {
/*     */     int $i$f$times-mpE4wyQ = 0;
/*     */     checkArithmetic--R2X_6o(other);
/*     */     return pack(TextUnit.getRawType-impl(other), (float)$this$times_u2dmpE4wyQ * TextUnit.getValue-impl(other));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long times-mpE4wyQ(int $this$times_u2dmpE4wyQ, long other) {
/*     */     int $i$f$times-mpE4wyQ = 0;
/*     */     checkArithmetic--R2X_6o(other);
/*     */     return pack(TextUnit.getRawType-impl(other), $this$times_u2dmpE4wyQ * TextUnit.getValue-impl(other));
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   public static final long pack(long unitType, float v) {
/*     */     return TextUnit.constructor-impl(unitType | Float.floatToIntBits(v) & 0xFFFFFFFFL);
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   public static final void checkArithmetic--R2X_6o(long a) {
/*     */     if (!(!isUnspecified--R2X_6o(a) ? 1 : 0)) {
/*     */       int $i$a$-require-TextUnitKt$checkArithmetic$1 = 0;
/*     */       String str = "Cannot perform operation for Unspecified type.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   public static final void checkArithmetic-NB67dxo(long a, long b) {
/*     */     if (!((!isUnspecified--R2X_6o(a) && !isUnspecified--R2X_6o(b)) ? 1 : 0)) {
/*     */       int $i$a$-require-TextUnitKt$checkArithmetic$2 = 0;
/*     */       String str = "Cannot perform operation for Unspecified type.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     if (!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(a), TextUnit.getType-UIouoOA(b))) {
/*     */       int $i$a$-require-TextUnitKt$checkArithmetic$3 = 0;
/*     */       String str = "Cannot perform operation for " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(a)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(b));
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   public static final void checkArithmetic-vU-0ePk(long a, long b, long c) {
/*     */     if (!((!isUnspecified--R2X_6o(a) && !isUnspecified--R2X_6o(b) && !isUnspecified--R2X_6o(c)) ? 1 : 0)) {
/*     */       int $i$a$-require-TextUnitKt$checkArithmetic$4 = 0;
/*     */       String str = "Cannot perform operation for Unspecified type.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     if (!((TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(a), TextUnit.getType-UIouoOA(b)) && TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(b), TextUnit.getType-UIouoOA(c))) ? 1 : 0)) {
/*     */       int $i$a$-require-TextUnitKt$checkArithmetic$5 = 0;
/*     */       String str = "Cannot perform operation for " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(a)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(b));
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long lerp-C3pnCVY(long start, long stop, float fraction) {
/*     */     checkArithmetic-NB67dxo(start, stop);
/*     */     return pack(TextUnit.getRawType-impl(start), MathHelpersKt.lerp(TextUnit.getValue-impl(start), TextUnit.getValue-impl(stop), fraction));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\TextUnitKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */