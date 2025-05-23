/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\024\n\002\b\005\n\002\020\002\n\002\b\005\n\002\020\007\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\016\n\002\030\002\n\002\030\002\n\002\b!\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\r\020\b\032\0020\t¢\006\004\b\n\020\013J\r\020\f\032\0020\t¢\006\004\b\r\020\013J2\020\016\032\0020\0172\006\020\020\032\0020\0002\006\020\021\032\0020\0222\006\020\023\032\0020\0002\006\020\024\032\0020\022H\002ø\001\000¢\006\004\b\025\020\026J\032\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003¢\006\004\b\032\020\033J \020\034\032\0020\0172\006\020\021\032\0020\0222\006\020\024\032\0020\022H\n¢\006\004\b\035\020\036J\020\020\037\032\0020\022HÖ\001¢\006\004\b \020!J\r\020\"\032\0020\t¢\006\004\b#\020\013JP\020$\032\0020\t2\006\020%\032\0020\01726\020&\0322\022\023\022\0210\017¢\006\f\b(\022\b\b)\022\004\b\b(*\022\023\022\0210\017¢\006\f\b(\022\b\b)\022\004\b\b(+\022\004\022\0020\t0'H\b¢\006\004\b,\020-J\030\020.\032\0020\t2\006\020/\032\0020\000ø\001\000¢\006\004\b0\0201J(\020.\032\0020\t2\006\020\021\032\0020\0222\006\020\024\032\0020\0222\006\0202\032\0020\017H\n¢\006\004\b3\0204J\025\0205\032\0020\t2\006\020%\032\0020\017¢\006\004\b6\0207J\025\0208\032\0020\t2\006\020%\032\0020\017¢\006\004\b9\0207J\025\020:\032\0020\t2\006\020%\032\0020\017¢\006\004\b;\0207J\025\020<\032\0020\t2\006\020=\032\0020\017¢\006\004\b>\0207J-\020?\032\0020\t2\006\020@\032\0020\0172\006\020A\032\0020\0172\006\020B\032\0020\0172\006\020C\032\0020\017¢\006\004\bD\020EJ\033\020F\032\0020\t2\006\020G\032\0020\000H\002ø\001\000¢\006\004\bH\0201J\020\020I\032\0020JHÖ\001¢\006\004\bK\020LR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002\002\007\n\005\b¡\0360\001¨\006M"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "convertRgbToYuv", "", "convertRgbToYuv-impl", "([F)V", "convertYuvToRgb", "convertYuvToRgb-impl", "dot", "", "m1", "row", "", "m2", "column", "dot-Me4OoYI", "([F[FI[FI)F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "reset", "reset-impl", "rotateInternal", "degrees", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cosine", "sine", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "set", "src", "set-jHG-Opc", "([F[F)V", "v", "set-impl", "([FIIF)V", "setToRotateBlue", "setToRotateBlue-impl", "([FF)V", "setToRotateGreen", "setToRotateGreen-impl", "setToRotateRed", "setToRotateRed-impl", "setToSaturation", "sat", "setToSaturation-impl", "setToScale", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "timesAssign", "colorMatrix", "timesAssign-jHG-Opc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,330:1\n98#1,2:331\n98#1,2:333\n98#1,2:335\n98#1,2:337\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n84#1:357\n84#1:358\n98#1,2:359\n98#1,2:361\n98#1,2:363\n98#1,2:365\n98#1,2:367\n98#1,2:369\n98#1,2:371\n98#1,2:373\n98#1,2:375\n98#1,2:377\n98#1,2:379\n98#1,2:381\n98#1,2:383\n98#1,2:385\n98#1,2:387\n98#1,2:389\n98#1,2:391\n98#1,2:393\n98#1,2:395\n98#1,2:397\n84#1:399\n84#1:400\n84#1:401\n84#1:402\n98#1,2:403\n98#1,2:405\n98#1,2:407\n98#1,2:409\n98#1,2:411\n98#1,2:413\n98#1,2:415\n98#1,2:417\n98#1,2:419\n98#1,2:421\n98#1,2:423\n98#1,2:425\n98#1,2:427\n134#1,5:429\n98#1,2:434\n98#1,2:436\n98#1,2:438\n98#1,2:440\n139#1:442\n134#1,5:443\n98#1,2:448\n98#1,2:450\n98#1,2:452\n98#1,2:454\n139#1:456\n134#1,5:457\n98#1,2:462\n98#1,2:464\n98#1,2:466\n98#1,2:468\n139#1:470\n98#1,2:471\n98#1,2:473\n98#1,2:475\n98#1,2:477\n98#1,2:479\n98#1,2:481\n98#1,2:483\n98#1,2:485\n98#1,2:487\n98#1,2:489\n98#1,2:491\n98#1,2:493\n98#1,2:495\n98#1,2:497\n98#1,2:499\n98#1,2:501\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n112#1:331,2\n113#1:333,2\n114#1:335,2\n115#1:337,2\n149#1:339\n150#1:340\n151#1:341\n152#1:342\n153#1:343\n159#1:344\n160#1:345\n161#1:346\n162#1:347\n163#1:348\n169#1:349\n170#1:350\n171#1:351\n172#1:352\n173#1:353\n179#1:354\n180#1:355\n181#1:356\n182#1:357\n183#1:358\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n204#1:397,2\n212#1:399\n213#1:400\n214#1:401\n215#1:402\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n237#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n259#1:427,2\n266#1:429,5\n267#1:434,2\n268#1:436,2\n269#1:438,2\n270#1:440,2\n266#1:442\n278#1:443,5\n279#1:448,2\n280#1:450,2\n281#1:452,2\n282#1:454,2\n278#1:456\n290#1:457,5\n291#1:462,2\n292#1:464,2\n293#1:466,2\n294#1:468,2\n290#1:470\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n312#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n327#1:501,2\n*E\n"})
/*     */ public final class ColorMatrix
/*     */ {
/*     */   @NotNull
/*     */   private final float[] values;
/*     */   
/*     */   @NotNull
/*     */   public final float[] getValues() {
/*  65 */     return this.values;
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
/*     */   public static final float get-impl(float[] arg0, int row, int column) {
/*  84 */     int $i$f$get-impl = 0; return arg0[row * 5 + column];
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
/*     */   public static final void set-impl(float[] arg0, int row, int column, float v) {
/*  98 */     int $i$f$set-impl = 0; arg0[row * 5 + column] = v;
/*     */   }
/*     */   public static final void set-jHG-Opc(float[] arg0, @NotNull float[] src) {
/*     */     Intrinsics.checkNotNullParameter(src, "src");
/*     */     ArraysKt.copyInto$default(src, arg0, 0, 0, 0, 14, null);
/*     */   } private static final void rotateInternal-impl(float[] arg0, float degrees, Function2 block) {
/*     */     int $i$f$rotateInternal-impl = 0;
/*     */     reset-impl(arg0);
/*     */     double radians = degrees * Math.PI / 180.0D;
/*     */     float cosine = (float)Math.cos(radians);
/*     */     float sine = (float)Math.sin(radians);
/*     */     block.invoke(Float.valueOf(cosine), Float.valueOf(sine));
/*     */   }
/* 111 */   public static final void reset-impl(float[] arg0) { ArraysKt.fill$default(arg0, 0.0F, 0, 0, 6, null);
/* 112 */     byte b1 = 0, b2 = 0; float v$iv = 1.0F; int $i$f$set-impl = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 331 */     arg0[b1 * 5 + b2] = v$iv; int row$iv = 2, column$iv = 2; v$iv = 1.0F;
/*     */     $i$f$set-impl = 0;
/* 333 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 1; column$iv = 1; v$iv = 1.0F;
/*     */     $i$f$set-impl = 0;
/* 335 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 3; column$iv = 3; v$iv = 1.0F;
/*     */     $i$f$set-impl = 0;
/* 337 */     arg0[row$iv * 5 + column$iv] = v$iv; } public static final void timesAssign-jHG-Opc(float[] arg0, @NotNull float[] colorMatrix) { Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix"); float v00 = dot-Me4OoYI(arg0, arg0, 0, colorMatrix, 0); float v01 = dot-Me4OoYI(arg0, arg0, 0, colorMatrix, 1); float v02 = dot-Me4OoYI(arg0, arg0, 0, colorMatrix, 2); float v03 = dot-Me4OoYI(arg0, arg0, 0, colorMatrix, 3); byte b1 = 0; int column$iv = 0, $i$f$get-impl = 0, row$iv = 0; column$iv = 4; $i$f$get-impl = 0; row$iv = 0; column$iv = 1; $i$f$get-impl = 0; row$iv = 1; column$iv = 4; $i$f$get-impl = 0; row$iv = 0; column$iv = 2; $i$f$get-impl = 0; row$iv = 2; column$iv = 4; $i$f$get-impl = 0; row$iv = 0; column$iv = 3; $i$f$get-impl = 0; row$iv = 3; column$iv = 4; $i$f$get-impl = 0; row$iv = 0; column$iv = 4;
/*     */     $i$f$get-impl = 0;
/* 339 */     float v04 = arg0[b1 * 5 + column$iv] * colorMatrix[row$iv * 5 + column$iv] + 
/* 340 */       arg0[row$iv * 5 + column$iv] * colorMatrix[row$iv * 5 + column$iv] + 
/* 341 */       arg0[row$iv * 5 + column$iv] * colorMatrix[row$iv * 5 + column$iv] + 
/* 342 */       arg0[row$iv * 5 + column$iv] * colorMatrix[row$iv * 5 + column$iv] + 
/* 343 */       arg0[row$iv * 5 + column$iv]; float v10 = dot-Me4OoYI(arg0, arg0, 1, colorMatrix, 0); float v11 = dot-Me4OoYI(arg0, arg0, 1, colorMatrix, 1); float v12 = dot-Me4OoYI(arg0, arg0, 1, colorMatrix, 2); float v13 = dot-Me4OoYI(arg0, arg0, 1, colorMatrix, 3); byte b2 = 1; int j = 0, k = 0, i = 0; j = 4; k = 0; i = 1; j = 1; k = 0; i = 1; j = 4; k = 0; i = 1; j = 2; k = 0; i = 2; j = 4; k = 0; i = 1; j = 3; k = 0; i = 3; j = 4; k = 0; i = 1; j = 4; k = 0;
/* 344 */     float v14 = arg0[b2 * 5 + j] * colorMatrix[i * 5 + j] + 
/* 345 */       arg0[i * 5 + j] * colorMatrix[i * 5 + j] + 
/* 346 */       arg0[i * 5 + j] * colorMatrix[i * 5 + j] + 
/* 347 */       arg0[i * 5 + j] * colorMatrix[i * 5 + j] + 
/* 348 */       arg0[i * 5 + j]; float v20 = dot-Me4OoYI(arg0, arg0, 2, colorMatrix, 0); float v21 = dot-Me4OoYI(arg0, arg0, 2, colorMatrix, 1); float v22 = dot-Me4OoYI(arg0, arg0, 2, colorMatrix, 2); float v23 = dot-Me4OoYI(arg0, arg0, 2, colorMatrix, 3); byte b3 = 2; int n = 0, i1 = 0, m = 0; n = 4; i1 = 0; m = 2; n = 1; i1 = 0; m = 1; n = 4; i1 = 0; m = 2; n = 2; i1 = 0; m = 2; n = 4; i1 = 0; m = 2; n = 3; i1 = 0; m = 3; n = 4; i1 = 0; m = 2; n = 4; i1 = 0;
/* 349 */     float v24 = arg0[b3 * 5 + n] * colorMatrix[m * 5 + n] + 
/* 350 */       arg0[m * 5 + n] * colorMatrix[m * 5 + n] + 
/* 351 */       arg0[m * 5 + n] * colorMatrix[m * 5 + n] + 
/* 352 */       arg0[m * 5 + n] * colorMatrix[m * 5 + n] + 
/* 353 */       arg0[m * 5 + n]; float v30 = dot-Me4OoYI(arg0, arg0, 3, colorMatrix, 0); float v31 = dot-Me4OoYI(arg0, arg0, 3, colorMatrix, 1); float v32 = dot-Me4OoYI(arg0, arg0, 3, colorMatrix, 2); float v33 = dot-Me4OoYI(arg0, arg0, 3, colorMatrix, 3); byte b4 = 3; int i3 = 0, i4 = 0, i2 = 0; i3 = 4; i4 = 0; i2 = 3; i3 = 1; i4 = 0; i2 = 1; i3 = 4; i4 = 0; i2 = 3; i3 = 2; i4 = 0; i2 = 2; i3 = 4; i4 = 0; i2 = 3; i3 = 3; i4 = 0; i2 = 3; i3 = 4; i4 = 0; i2 = 3; i3 = 4; i4 = 0;
/* 354 */     float v34 = arg0[b4 * 5 + i3] * colorMatrix[i2 * 5 + i3] + 
/* 355 */       arg0[i2 * 5 + i3] * colorMatrix[i2 * 5 + i3] + 
/* 356 */       arg0[i2 * 5 + i3] * colorMatrix[i2 * 5 + i3] + 
/* 357 */       arg0[i2 * 5 + i3] * colorMatrix[i2 * 5 + i3] + 
/* 358 */       arg0[i2 * 5 + i3]; i2 = 0; i3 = 0; int $i$f$set-impl = 0;
/* 359 */     arg0[i2 * 5 + i3] = v00; i2 = 0; i3 = 1;
/*     */     $i$f$set-impl = 0;
/* 361 */     arg0[i2 * 5 + i3] = v01; i2 = 0; i3 = 2;
/*     */     $i$f$set-impl = 0;
/* 363 */     arg0[i2 * 5 + i3] = v02; i2 = 0; i3 = 3;
/*     */     $i$f$set-impl = 0;
/* 365 */     arg0[i2 * 5 + i3] = v03; i2 = 0; i3 = 4;
/*     */     $i$f$set-impl = 0;
/* 367 */     arg0[i2 * 5 + i3] = v04; i2 = 1; i3 = 0;
/*     */     $i$f$set-impl = 0;
/* 369 */     arg0[i2 * 5 + i3] = v10; i2 = 1; i3 = 1;
/*     */     $i$f$set-impl = 0;
/* 371 */     arg0[i2 * 5 + i3] = v11; i2 = 1; i3 = 2;
/*     */     $i$f$set-impl = 0;
/* 373 */     arg0[i2 * 5 + i3] = v12; i2 = 1; i3 = 3;
/*     */     $i$f$set-impl = 0;
/* 375 */     arg0[i2 * 5 + i3] = v13; i2 = 1; i3 = 4;
/*     */     $i$f$set-impl = 0;
/* 377 */     arg0[i2 * 5 + i3] = v14; i2 = 2; i3 = 0;
/*     */     $i$f$set-impl = 0;
/* 379 */     arg0[i2 * 5 + i3] = v20; i2 = 2; i3 = 1;
/*     */     $i$f$set-impl = 0;
/* 381 */     arg0[i2 * 5 + i3] = v21; i2 = 2; i3 = 2;
/*     */     $i$f$set-impl = 0;
/* 383 */     arg0[i2 * 5 + i3] = v22; i2 = 2; i3 = 3;
/*     */     $i$f$set-impl = 0;
/* 385 */     arg0[i2 * 5 + i3] = v23; i2 = 2; i3 = 4;
/*     */     $i$f$set-impl = 0;
/* 387 */     arg0[i2 * 5 + i3] = v24; i2 = 3; i3 = 0;
/*     */     $i$f$set-impl = 0;
/* 389 */     arg0[i2 * 5 + i3] = v30; i2 = 3; i3 = 1;
/*     */     $i$f$set-impl = 0;
/* 391 */     arg0[i2 * 5 + i3] = v31; i2 = 3; i3 = 2;
/*     */     $i$f$set-impl = 0;
/* 393 */     arg0[i2 * 5 + i3] = v32; i2 = 3; i3 = 3;
/*     */     $i$f$set-impl = 0;
/* 395 */     arg0[i2 * 5 + i3] = v33; i2 = 3; i3 = 4;
/*     */     $i$f$set-impl = 0;
/* 397 */     arg0[i2 * 5 + i3] = v34; } private static final float dot-Me4OoYI(float[] arg0, float[] m1, int row, float[] m2, int column) { int i1 = 0, $i$f$get-impl = 0, n = 0; $i$f$get-impl = 0; int m = 1; $i$f$get-impl = 0; int k = 1; $i$f$get-impl = 0; int j = 2; $i$f$get-impl = 0; int i = 2; $i$f$get-impl = 0; int column$iv = 3; $i$f$get-impl = 0; int row$iv = 3;
/*     */     $i$f$get-impl = 0;
/* 399 */     return m1[row * 5 + i1] * m2[n * 5 + column] + 
/* 400 */       m1[row * 5 + m] * m2[k * 5 + column] + 
/* 401 */       m1[row * 5 + j] * m2[i * 5 + column] + 
/* 402 */       m1[row * 5 + column$iv] * m2[row$iv * 5 + column]; } public static final void setToSaturation-impl(float[] arg0, float sat) { reset-impl(arg0); float invSat = true - sat; float R = 0.213F * invSat; float G = 0.715F * invSat; float B = 0.072F * invSat; byte b1 = 0, b2 = 0; float f2 = R + sat; int j = 0;
/* 403 */     arg0[b1 * 5 + b2] = f2;
/*     */     int row$iv = 0, column$iv = 1, i = 0;
/* 405 */     arg0[row$iv * 5 + column$iv] = G; row$iv = 0; column$iv = 2;
/*     */     i = 0;
/* 407 */     arg0[row$iv * 5 + column$iv] = B; row$iv = 1; column$iv = 0;
/*     */     i = 0;
/* 409 */     arg0[row$iv * 5 + column$iv] = R; row$iv = 1; column$iv = 1; float f1 = G + sat;
/*     */     j = 0;
/* 411 */     arg0[row$iv * 5 + column$iv] = f1; row$iv = 1; column$iv = 2;
/*     */     int $i$f$set-impl = 0;
/* 413 */     arg0[row$iv * 5 + column$iv] = B; row$iv = 2; column$iv = 0;
/*     */     $i$f$set-impl = 0;
/* 415 */     arg0[row$iv * 5 + column$iv] = R; row$iv = 2; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 417 */     arg0[row$iv * 5 + column$iv] = G; row$iv = 2; column$iv = 2; float v$iv = B + sat;
/*     */     j = 0;
/* 419 */     arg0[row$iv * 5 + column$iv] = v$iv; } public static final void setToScale-impl(float[] arg0, float redScale, float greenScale, float blueScale, float alphaScale) { reset-impl(arg0); byte b = 0;
/*     */     int column$iv = 0, $i$f$set-impl = 0;
/* 421 */     arg0[b * 5 + column$iv] = redScale; int row$iv = 1; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 423 */     arg0[row$iv * 5 + column$iv] = greenScale; row$iv = 2; column$iv = 2;
/*     */     $i$f$set-impl = 0;
/* 425 */     arg0[row$iv * 5 + column$iv] = blueScale; row$iv = 3; column$iv = 3;
/*     */     $i$f$set-impl = 0;
/* 427 */     arg0[row$iv * 5 + column$iv] = alphaScale; } public static final void setToRotateRed-impl(float[] arg0, float degrees) {
/*     */     int $i$f$rotateInternal-impl = 0;
/* 429 */     reset-impl(arg0);
/* 430 */     double radians$iv = degrees * Math.PI / 180.0D;
/* 431 */     float cosine$iv = (float)Math.cos(radians$iv);
/* 432 */     float sine$iv = (float)Math.sin(radians$iv);
/* 433 */     float f1 = sine$iv, cosine = cosine$iv; int $i$a$-rotateInternal-impl-ColorMatrix$setToRotateRed$1 = 0; byte b = 2; int column$iv = 2, $i$f$set-impl = 0;
/* 434 */     arg0[b * 5 + column$iv] = cosine; int row$iv = 1; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 436 */     arg0[row$iv * 5 + column$iv] = cosine; row$iv = 1; column$iv = 2;
/*     */     $i$f$set-impl = 0;
/* 438 */     arg0[row$iv * 5 + column$iv] = f1; row$iv = 2; column$iv = 1; float v$iv = -f1;
/*     */     int i = 0;
/* 440 */     arg0[row$iv * 5 + column$iv] = v$iv;
/*     */   } public static final void setToRotateGreen-impl(float[] arg0, float degrees) {
/*     */     int $i$f$rotateInternal-impl = 0;
/* 443 */     reset-impl(arg0);
/* 444 */     double radians$iv = degrees * Math.PI / 180.0D;
/* 445 */     float cosine$iv = (float)Math.cos(radians$iv);
/* 446 */     float sine$iv = (float)Math.sin(radians$iv);
/* 447 */     float f1 = sine$iv, cosine = cosine$iv; int $i$a$-rotateInternal-impl-ColorMatrix$setToRotateGreen$1 = 0; byte b = 2; int column$iv = 2, i = 0;
/* 448 */     arg0[b * 5 + column$iv] = cosine; int row$iv = 0; column$iv = 0;
/*     */     i = 0;
/* 450 */     arg0[row$iv * 5 + column$iv] = cosine; row$iv = 0; column$iv = 2; float v$iv = -f1;
/*     */     int j = 0;
/* 452 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 0;
/*     */     int $i$f$set-impl = 0;
/* 454 */     arg0[row$iv * 5 + column$iv] = f1;
/*     */   }
/*     */   public static final void setToRotateBlue-impl(float[] arg0, float degrees) { int $i$f$rotateInternal-impl = 0;
/* 457 */     reset-impl(arg0);
/* 458 */     double radians$iv = degrees * Math.PI / 180.0D;
/* 459 */     float cosine$iv = (float)Math.cos(radians$iv);
/* 460 */     float sine$iv = (float)Math.sin(radians$iv);
/* 461 */     float f1 = sine$iv, cosine = cosine$iv; int $i$a$-rotateInternal-impl-ColorMatrix$setToRotateBlue$1 = 0; byte b = 1; int column$iv = 1, $i$f$set-impl = 0;
/* 462 */     arg0[b * 5 + column$iv] = cosine; int row$iv = 0; column$iv = 0;
/*     */     $i$f$set-impl = 0;
/* 464 */     arg0[row$iv * 5 + column$iv] = cosine; row$iv = 0; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 466 */     arg0[row$iv * 5 + column$iv] = f1; row$iv = 1; column$iv = 0; float v$iv = -f1;
/*     */     int i = 0;
/* 468 */     arg0[row$iv * 5 + column$iv] = v$iv; } public static final void convertRgbToYuv-impl(float[] arg0) { reset-impl(arg0); byte b1 = 0, b2 = 0;
/*     */     float v$iv = 0.299F;
/*     */     int $i$f$set-impl = 0;
/* 471 */     arg0[b1 * 5 + b2] = v$iv; int row$iv = 0, column$iv = 1; v$iv = 0.587F;
/*     */     $i$f$set-impl = 0;
/* 473 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 0; column$iv = 2; v$iv = 0.114F;
/*     */     $i$f$set-impl = 0;
/* 475 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 1; column$iv = 0; v$iv = -0.16874F;
/*     */     $i$f$set-impl = 0;
/* 477 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 1; column$iv = 1; v$iv = -0.33126F;
/*     */     $i$f$set-impl = 0;
/* 479 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 1; column$iv = 2; v$iv = 0.5F;
/*     */     $i$f$set-impl = 0;
/* 481 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 0; v$iv = 0.5F;
/*     */     $i$f$set-impl = 0;
/* 483 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 1; v$iv = -0.41869F;
/*     */     $i$f$set-impl = 0;
/* 485 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 2; v$iv = -0.08131F;
/*     */     $i$f$set-impl = 0;
/* 487 */     arg0[row$iv * 5 + column$iv] = v$iv; } public static final void convertYuvToRgb-impl(float[] arg0) { reset-impl(arg0); byte b1 = 0, b2 = 2; float v$iv = 1.402F;
/*     */     int $i$f$set-impl = 0;
/* 489 */     arg0[b1 * 5 + b2] = v$iv; int row$iv = 1, column$iv = 0; v$iv = 1.0F;
/*     */     $i$f$set-impl = 0;
/* 491 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 1; column$iv = 1; v$iv = -0.34414F;
/*     */     $i$f$set-impl = 0;
/* 493 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 1; column$iv = 2; v$iv = -0.71414F;
/*     */     $i$f$set-impl = 0;
/* 495 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 0; v$iv = 1.0F;
/*     */     $i$f$set-impl = 0;
/* 497 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 1; v$iv = 1.772F;
/*     */     $i$f$set-impl = 0;
/* 499 */     arg0[row$iv * 5 + column$iv] = v$iv; row$iv = 2; column$iv = 2; v$iv = 0.0F;
/*     */     $i$f$set-impl = 0;
/* 501 */     arg0[row$iv * 5 + column$iv] = v$iv; }
/*     */ 
/*     */   
/*     */   public static String toString-impl(float[] arg0) {
/*     */     return "ColorMatrix(values=" + Arrays.toString(arg0) + ')';
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     return toString-impl(this.values);
/*     */   }
/*     */   
/*     */   public static int hashCode-impl(float[] arg0) {
/*     */     return Arrays.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.values);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(float[] arg0, Object other) {
/*     */     return !(other instanceof ColorMatrix) ? false : (!!Intrinsics.areEqual(arg0, ((ColorMatrix)other).unbox-impl()));
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.values, other);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static float[] constructor-impl(@NotNull float[] values) {
/*     */     Intrinsics.checkNotNullParameter(values, "values");
/*     */     return values;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(float[] p1, float[] p2) {
/*     */     return Intrinsics.areEqual(p1, p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\ColorMatrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */