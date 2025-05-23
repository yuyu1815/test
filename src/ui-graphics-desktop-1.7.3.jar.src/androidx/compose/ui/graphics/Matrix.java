/*     */ package androidx.compose.ui.graphics;
/*     */ import androidx.compose.ui.geometry.MutableRect;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\024\n\002\b\005\n\002\020\013\n\002\b\004\n\002\020\007\n\000\n\002\020\b\n\002\b\007\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\035\n\002\020\016\n\002\b\006\b@\030\000 G2\0020\001:\001GB\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ \020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\020H\n¢\006\004\b\022\020\023J\020\020\024\032\0020\020HÖ\001¢\006\004\b\025\020\026J\r\020\027\032\0020\030¢\006\004\b\031\020\032J\025\020\033\032\0020\0302\006\020\034\032\0020\035¢\006\004\b\036\020\037J\030\020\033\032\0020 2\006\020!\032\0020 ø\001\000¢\006\004\b\"\020#J\025\020\033\032\0020$2\006\020\034\032\0020$¢\006\004\b\036\020%J\r\020&\032\0020\030¢\006\004\b'\020\032J\025\020(\032\0020\0302\006\020)\032\0020\016¢\006\004\b*\020+J\025\020,\032\0020\0302\006\020)\032\0020\016¢\006\004\b-\020+J\025\020.\032\0020\0302\006\020)\032\0020\016¢\006\004\b/\020+J+\0200\032\0020\0302\b\b\002\0201\032\0020\0162\b\b\002\0202\032\0020\0162\b\b\002\0203\032\0020\016¢\006\004\b4\0205J(\0206\032\0020\0302\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\0207\032\0020\016H\n¢\006\004\b8\0209J\030\020:\032\0020\0302\006\020;\032\0020\000ø\001\000¢\006\004\b<\020=J\033\020>\032\0020\0302\006\020?\032\0020\000H\002ø\001\000¢\006\004\b@\020=J\017\020A\032\0020BH\026¢\006\004\bC\020DJ+\020E\032\0020\0302\b\b\002\0201\032\0020\0162\b\b\002\0202\032\0020\0162\b\b\002\0203\032\0020\016¢\006\004\bF\0205R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002\002\007\n\005\b¡\0360\001¨\006H"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#1:442\n39#1:443\n39#1:444\n42#1,2:445\n42#1,2:447\n42#1,2:449\n42#1,2:451\n42#1,2:453\n42#1,2:455\n42#1,2:457\n42#1,2:459\n42#1,2:461\n42#1,2:463\n42#1,2:465\n42#1,2:467\n42#1,2:469\n42#1,2:471\n42#1,2:473\n42#1,2:475\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n39#1:496\n42#1,2:497\n42#1,2:499\n42#1,2:501\n42#1,2:503\n42#1,2:505\n42#1,2:507\n42#1,2:509\n42#1,2:511\n42#1,2:513\n42#1,2:515\n42#1,2:517\n42#1,2:519\n42#1,2:521\n42#1,2:523\n42#1,2:525\n42#1,2:527\n42#1,2:529\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n39#1:538\n42#1,2:539\n42#1,2:541\n42#1,2:543\n42#1,2:545\n42#1,2:547\n42#1,2:549\n42#1,2:551\n42#1,2:553\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n39#1:562\n42#1,2:563\n42#1,2:565\n42#1,2:567\n42#1,2:569\n42#1,2:571\n42#1,2:573\n42#1,2:575\n42#1,2:577\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n39#1:586\n42#1,2:587\n42#1,2:589\n42#1,2:591\n42#1,2:593\n42#1,2:595\n42#1,2:597\n42#1,2:599\n42#1,2:601\n39#1,5:603\n39#1,5:608\n39#1,5:613\n39#1,5:618\n39#1,5:623\n39#1,5:628\n39#1,5:633\n39#1,5:638\n39#1,5:643\n39#1,5:648\n39#1,5:653\n39#1,5:658\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n39#1:678\n42#1,2:679\n42#1,2:681\n42#1,2:683\n42#1,2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:442\n56#1:443\n57#1:444\n112#1:445,2\n113#1:447,2\n114#1:449,2\n115#1:451,2\n116#1:453,2\n117#1:455,2\n118#1:457,2\n119#1:459,2\n120#1:461,2\n121#1:463,2\n122#1:465,2\n123#1:467,2\n124#1:469,2\n125#1:471,2\n126#1:473,2\n127#1:475,2\n132#1:477\n133#1:478\n134#1:479\n135#1:480\n143#1:481\n144#1:482\n145#1:483\n146#1:484\n147#1:485\n148#1:486\n149#1:487\n150#1:488\n151#1:489\n152#1:490\n153#1:491\n154#1:492\n155#1:493\n156#1:494\n157#1:495\n158#1:496\n177#1:497,2\n178#1:499,2\n179#1:501,2\n180#1:503,2\n181#1:505,2\n182#1:507,2\n183#1:509,2\n184#1:511,2\n185#1:513,2\n186#1:515,2\n187#1:517,2\n188#1:519,2\n189#1:521,2\n190#1:523,2\n191#1:525,2\n192#1:527,2\n201#1:529,2\n220#1:531\n221#1:532\n225#1:533\n226#1:534\n230#1:535\n231#1:536\n235#1:537\n236#1:538\n240#1:539,2\n241#1:541,2\n242#1:543,2\n243#1:545,2\n244#1:547,2\n245#1:549,2\n246#1:551,2\n247#1:553,2\n257#1:555\n258#1:556\n262#1:557\n263#1:558\n267#1:559\n268#1:560\n272#1:561\n273#1:562\n277#1:563,2\n278#1:565,2\n279#1:567,2\n280#1:569,2\n281#1:571,2\n282#1:573,2\n283#1:575,2\n284#1:577,2\n294#1:579\n295#1:580\n299#1:581\n300#1:582\n304#1:583\n305#1:584\n309#1:585\n310#1:586\n314#1:587,2\n315#1:589,2\n316#1:591,2\n317#1:593,2\n318#1:595,2\n319#1:597,2\n320#1:599,2\n321#1:601,2\n326#1:603,5\n327#1:608,5\n328#1:613,5\n329#1:618,5\n330#1:623,5\n331#1:628,5\n332#1:633,5\n333#1:638,5\n334#1:643,5\n335#1:648,5\n336#1:653,5\n337#1:658,5\n342#1:663\n343#1:664\n344#1:665\n345#1:666\n346#1:667\n347#1:668\n348#1:669\n349#1:670\n350#1:671\n351#1:672\n352#1:673\n353#1:674\n354#1:675\n355#1:676\n356#1:677\n357#1:678\n358#1:679,2\n359#1:681,2\n360#1:683,2\n361#1:685,2\n*E\n"})
/*     */ public final class Matrix {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final float[] values;
/*     */   public static final int ScaleX = 0;
/*     */   public static final int SkewY = 1;
/*     */   public static final int Perspective0 = 3;
/*     */   public static final int SkewX = 4;
/*     */   public static final int ScaleY = 5;
/*     */   public static final int Perspective1 = 7;
/*     */   public static final int ScaleZ = 10;
/*     */   public static final int TranslateX = 12;
/*     */   public static final int TranslateY = 13;
/*     */   public static final int TranslateZ = 14;
/*     */   public static final int Perspective2 = 15;
/*     */   
/*     */   @NotNull
/*     */   public final float[] getValues() {
/*  32 */     return this.values;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float get-impl(float[] arg0, int row, int column) {
/*  39 */     int $i$f$get-impl = 0; return arg0[row * 4 + column];
/*     */   }
/*     */   
/*  42 */   public static final void set-impl(float[] arg0, int row, int column, float v) { int $i$f$set-impl = 0; arg0[row * 4 + column] = v; } @NotNull public static final Rect map-impl(float[] arg0, @NotNull Rect rect) { Intrinsics.checkNotNullParameter(rect, "rect"); long p0 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getTop())); long p1 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getBottom())); long p3 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getTop()));
/*     */     long p4 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
/*     */     float left = Math.min(Math.min(Offset.getX-impl(p0), Offset.getX-impl(p1)), Math.min(Offset.getX-impl(p3), Offset.getX-impl(p4)));
/*     */     float top = Math.min(Math.min(Offset.getY-impl(p0), Offset.getY-impl(p1)), Math.min(Offset.getY-impl(p3), Offset.getY-impl(p4)));
/*     */     float right = Math.max(Math.max(Offset.getX-impl(p0), Offset.getX-impl(p1)), Math.max(Offset.getX-impl(p3), Offset.getX-impl(p4)));
/*     */     float bottom = Math.max(Math.max(Offset.getY-impl(p0), Offset.getY-impl(p1)), Math.max(Offset.getY-impl(p3), Offset.getY-impl(p4)));
/*     */     return new Rect(left, top, right, bottom); }
/*  49 */   public static final long map-MK-Hz9U(float[] arg0, long point) { float x = Offset.getX-impl(point);
/*  50 */     float y = Offset.getY-impl(point);
/*  51 */     byte b1 = 0; int column$iv = 3, $i$f$get-impl = 0, row$iv = 1; column$iv = 3; $i$f$get-impl = 0; row$iv = 3; column$iv = 3; $i$f$get-impl = 0; float z = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 442 */       arg0[b1 * 4 + column$iv] * x + arg0[row$iv * 4 + column$iv] * y + arg0[row$iv * 4 + column$iv]; float inverseZ = true / z; float f1 = inverseZ, pZ = ((!Float.isInfinite(f1) && !Float.isNaN(f1))) ? inverseZ : 0.0F; byte b2 = 0; int j = 0, k = 0, i = 1; j = 0; k = 0; i = 3; j = 0; k = 0; i = 0; j = 1; k = 0; i = 1; j = 1; k = 0; i = 3; j = 1; k = 0;
/* 443 */     return OffsetKt.Offset(pZ * (arg0[b2 * 4 + j] * x + arg0[i * 4 + j] * y + arg0[i * 4 + j]), pZ * (
/* 444 */         arg0[i * 4 + j] * x + arg0[i * 4 + j] * y + arg0[i * 4 + j])); } public static final void map-impl(float[] arg0, @NotNull MutableRect rect) { Intrinsics.checkNotNullParameter(rect, "rect"); long p0 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getTop())); long p1 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getBottom())); long p3 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getTop())); long p4 = map-MK-Hz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getBottom())); rect.setLeft(Math.min(Math.min(Offset.getX-impl(p0), Offset.getX-impl(p1)), Math.min(Offset.getX-impl(p3), Offset.getX-impl(p4)))); rect.setTop(Math.min(Math.min(Offset.getY-impl(p0), Offset.getY-impl(p1)), Math.min(Offset.getY-impl(p3), Offset.getY-impl(p4)))); rect.setRight(Math.max(Math.max(Offset.getX-impl(p0), Offset.getX-impl(p1)), Math.max(Offset.getX-impl(p3), Offset.getX-impl(p4)))); rect.setBottom(Math.max(Math.max(Offset.getY-impl(p0), Offset.getY-impl(p1)), Math.max(Offset.getY-impl(p3), Offset.getY-impl(p4)))); }
/* 445 */   public static final void timesAssign-58bKbWc(float[] arg0, @NotNull float[] m) { Intrinsics.checkNotNullParameter(m, "m"); float v00 = MatrixKt.access$dot-p89u6pk(arg0, 0, m, 0); float v01 = MatrixKt.access$dot-p89u6pk(arg0, 0, m, 1); float v02 = MatrixKt.access$dot-p89u6pk(arg0, 0, m, 2); float v03 = MatrixKt.access$dot-p89u6pk(arg0, 0, m, 3); float v10 = MatrixKt.access$dot-p89u6pk(arg0, 1, m, 0); float v11 = MatrixKt.access$dot-p89u6pk(arg0, 1, m, 1); float v12 = MatrixKt.access$dot-p89u6pk(arg0, 1, m, 2); float v13 = MatrixKt.access$dot-p89u6pk(arg0, 1, m, 3); float v20 = MatrixKt.access$dot-p89u6pk(arg0, 2, m, 0); float v21 = MatrixKt.access$dot-p89u6pk(arg0, 2, m, 1); float v22 = MatrixKt.access$dot-p89u6pk(arg0, 2, m, 2); float v23 = MatrixKt.access$dot-p89u6pk(arg0, 2, m, 3); float v30 = MatrixKt.access$dot-p89u6pk(arg0, 3, m, 0); float v31 = MatrixKt.access$dot-p89u6pk(arg0, 3, m, 1); float v32 = MatrixKt.access$dot-p89u6pk(arg0, 3, m, 2); float v33 = MatrixKt.access$dot-p89u6pk(arg0, 3, m, 3); byte b = 0; int column$iv = 0, $i$f$set-impl = 0; arg0[b * 4 + column$iv] = v00; int row$iv = 0; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 447 */     arg0[row$iv * 4 + column$iv] = v01; row$iv = 0; column$iv = 2;
/*     */     $i$f$set-impl = 0;
/* 449 */     arg0[row$iv * 4 + column$iv] = v02; row$iv = 0; column$iv = 3;
/*     */     $i$f$set-impl = 0;
/* 451 */     arg0[row$iv * 4 + column$iv] = v03; row$iv = 1; column$iv = 0;
/*     */     $i$f$set-impl = 0;
/* 453 */     arg0[row$iv * 4 + column$iv] = v10; row$iv = 1; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 455 */     arg0[row$iv * 4 + column$iv] = v11; row$iv = 1; column$iv = 2;
/*     */     $i$f$set-impl = 0;
/* 457 */     arg0[row$iv * 4 + column$iv] = v12; row$iv = 1; column$iv = 3;
/*     */     $i$f$set-impl = 0;
/* 459 */     arg0[row$iv * 4 + column$iv] = v13; row$iv = 2; column$iv = 0;
/*     */     $i$f$set-impl = 0;
/* 461 */     arg0[row$iv * 4 + column$iv] = v20; row$iv = 2; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 463 */     arg0[row$iv * 4 + column$iv] = v21; row$iv = 2; column$iv = 2;
/*     */     $i$f$set-impl = 0;
/* 465 */     arg0[row$iv * 4 + column$iv] = v22; row$iv = 2; column$iv = 3;
/*     */     $i$f$set-impl = 0;
/* 467 */     arg0[row$iv * 4 + column$iv] = v23; row$iv = 3; column$iv = 0;
/*     */     $i$f$set-impl = 0;
/* 469 */     arg0[row$iv * 4 + column$iv] = v30; row$iv = 3; column$iv = 1;
/*     */     $i$f$set-impl = 0;
/* 471 */     arg0[row$iv * 4 + column$iv] = v31; row$iv = 3; column$iv = 2;
/*     */     $i$f$set-impl = 0;
/* 473 */     arg0[row$iv * 4 + column$iv] = v32; row$iv = 3; column$iv = 3;
/*     */     $i$f$set-impl = 0;
/* 475 */     arg0[row$iv * 4 + column$iv] = v33; } @NotNull public static String toString-impl(float[] arg0) { StringBuilder stringBuilder = new StringBuilder(); byte b = 0; int column$iv = 0, $i$f$get-impl = 0, row$iv = 0; column$iv = 1; $i$f$get-impl = 0; row$iv = 0; column$iv = 2; $i$f$get-impl = 0; row$iv = 0; column$iv = 3; $i$f$get-impl = 0; row$iv = 1; column$iv = 0; $i$f$get-impl = 0; row$iv = 1; column$iv = 1; $i$f$get-impl = 0; row$iv = 1; column$iv = 2; $i$f$get-impl = 0; row$iv = 1; column$iv = 3; $i$f$get-impl = 0; row$iv = 2; column$iv = 0; $i$f$get-impl = 0; row$iv = 2; column$iv = 1; $i$f$get-impl = 0; row$iv = 2; column$iv = 2;
/*     */     $i$f$get-impl = 0;
/* 477 */     stringBuilder.append("\n            |").append(arg0[b * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append("|\n            |").append(
/* 478 */         arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append("|\n            |").append(
/* 479 */         arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' '); row$iv = 2; column$iv = 3; $i$f$get-impl = 0; row$iv = 3; column$iv = 0; $i$f$get-impl = 0; row$iv = 3; column$iv = 1; $i$f$get-impl = 0; row$iv = 3; column$iv = 2; $i$f$get-impl = 0; row$iv = 3; column$iv = 3; $i$f$get-impl = 0; stringBuilder.append(arg0[row$iv * 4 + column$iv]).append("|\n            |").append(
/* 480 */         arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append(' ').append(arg0[row$iv * 4 + column$iv]).append("|\n        "); return StringsKt.trimIndent(stringBuilder.toString()); }
/* 481 */   @NotNull public String toString() { return toString-impl(this.values); } public static final void invert-impl(float[] arg0) { byte b1 = 0; int column$iv = 0, $i$f$get-impl = 0; float a00 = arg0[b1 * 4 + column$iv]; column$iv = 0; int i = 1, k = 0;
/* 482 */     float a01 = arg0[column$iv * 4 + i]; i = 0; int j = 2, n = 0;
/* 483 */     float a02 = arg0[i * 4 + j]; j = 0; int m = 3, i2 = 0;
/* 484 */     float a03 = arg0[j * 4 + m]; m = 1; int i1 = 0, i4 = 0;
/* 485 */     float a10 = arg0[m * 4 + i1]; i1 = 1; int i3 = 1, i6 = 0;
/* 486 */     float a11 = arg0[i1 * 4 + i3]; i3 = 1; int i5 = 2, i8 = 0;
/* 487 */     float a12 = arg0[i3 * 4 + i5]; i5 = 1; int i7 = 3, i10 = 0;
/* 488 */     float a13 = arg0[i5 * 4 + i7]; i7 = 2; int i9 = 0, i12 = 0;
/* 489 */     float a20 = arg0[i7 * 4 + i9]; i9 = 2; int i11 = 1, i14 = 0;
/* 490 */     float a21 = arg0[i9 * 4 + i11]; i11 = 2; int i13 = 2, i16 = 0;
/* 491 */     float a22 = arg0[i11 * 4 + i13]; i13 = 2; int i15 = 3, i18 = 0;
/* 492 */     float a23 = arg0[i13 * 4 + i15]; i15 = 3; int i17 = 0, i20 = 0;
/* 493 */     float a30 = arg0[i15 * 4 + i17]; i17 = 3; int i19 = 1, i22 = 0;
/* 494 */     float a31 = arg0[i17 * 4 + i19]; i19 = 3; int i21 = 2, i24 = 0;
/* 495 */     float a32 = arg0[i19 * 4 + i21]; i21 = 3; int i23 = 3, i25 = 0;
/* 496 */     float a33 = arg0[i21 * 4 + i23]; float b00 = a00 * a11 - a01 * a10; float b01 = a00 * a12 - a02 * a10; float b02 = a00 * a13 - a03 * a10; float b03 = a01 * a12 - a02 * a11; float b04 = a01 * a13 - a03 * a11; float b05 = a02 * a13 - a03 * a12; float b06 = a20 * a31 - a21 * a30; float b07 = a20 * a32 - a22 * a30; float b08 = a20 * a33 - a23 * a30; float b09 = a21 * a32 - a22 * a31; float b10 = a21 * a33 - a23 * a31; float b11 = a22 * a33 - a23 * a32; float det = b00 * b11 - b01 * b10 + b02 * b09 + b03 * b08 - b04 * b07 + b05 * b06; if ((det == 0.0F))
/* 497 */       return;  float invDet = 1.0F / det; byte b2 = 0, b3 = 0; float v$iv = (a11 * b11 - a12 * b10 + a13 * b09) * invDet; int $i$f$set-impl = 0; arg0[b2 * 4 + b3] = v$iv; int row$iv = 0, i26 = 1; v$iv = (-a01 * b11 + a02 * b10 - a03 * b09) * invDet;
/*     */     $i$f$set-impl = 0;
/* 499 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 0; i26 = 2; v$iv = (a31 * b05 - a32 * b04 + a33 * b03) * invDet;
/*     */     $i$f$set-impl = 0;
/* 501 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 0; i26 = 3; v$iv = (-a21 * b05 + a22 * b04 - a23 * b03) * invDet;
/*     */     $i$f$set-impl = 0;
/* 503 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 1; i26 = 0; v$iv = (-a10 * b11 + a12 * b08 - a13 * b07) * invDet;
/*     */     $i$f$set-impl = 0;
/* 505 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 1; i26 = 1; v$iv = (a00 * b11 - a02 * b08 + a03 * b07) * invDet;
/*     */     $i$f$set-impl = 0;
/* 507 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 1; i26 = 2; v$iv = (-a30 * b05 + a32 * b02 - a33 * b01) * invDet;
/*     */     $i$f$set-impl = 0;
/* 509 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 1; i26 = 3; v$iv = (a20 * b05 - a22 * b02 + a23 * b01) * invDet;
/*     */     $i$f$set-impl = 0;
/* 511 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 2; i26 = 0; v$iv = (a10 * b10 - a11 * b08 + a13 * b06) * invDet;
/*     */     $i$f$set-impl = 0;
/* 513 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 2; i26 = 1; v$iv = (-a00 * b10 + a01 * b08 - a03 * b06) * invDet;
/*     */     $i$f$set-impl = 0;
/* 515 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 2; i26 = 2; v$iv = (a30 * b04 - a31 * b02 + a33 * b00) * invDet;
/*     */     $i$f$set-impl = 0;
/* 517 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 2; i26 = 3; v$iv = (-a20 * b04 + a21 * b02 - a23 * b00) * invDet;
/*     */     $i$f$set-impl = 0;
/* 519 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 3; i26 = 0; v$iv = (-a10 * b09 + a11 * b07 - a12 * b06) * invDet;
/*     */     $i$f$set-impl = 0;
/* 521 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 3; i26 = 1; v$iv = (a00 * b09 - a01 * b07 + a02 * b06) * invDet;
/*     */     $i$f$set-impl = 0;
/* 523 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 3; i26 = 2; v$iv = (-a30 * b03 + a31 * b01 - a32 * b00) * invDet;
/*     */     $i$f$set-impl = 0;
/* 525 */     arg0[row$iv * 4 + i26] = v$iv; row$iv = 3; i26 = 3; v$iv = (a20 * b03 - a21 * b01 + a22 * b00) * invDet;
/*     */     $i$f$set-impl = 0;
/* 527 */     arg0[row$iv * 4 + i26] = v$iv; } public static final void reset-impl(float[] arg0) { // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_1
/*     */     //   2: iload_1
/*     */     //   3: iconst_4
/*     */     //   4: if_icmpge -> 49
/*     */     //   7: iconst_0
/*     */     //   8: istore_2
/*     */     //   9: iload_2
/*     */     //   10: iconst_4
/*     */     //   11: if_icmpge -> 43
/*     */     //   14: iload_1
/*     */     //   15: iload_2
/*     */     //   16: if_icmpne -> 23
/*     */     //   19: fconst_1
/*     */     //   20: goto -> 24
/*     */     //   23: fconst_0
/*     */     //   24: fstore_3
/*     */     //   25: iconst_0
/*     */     //   26: istore #4
/*     */     //   28: aload_0
/*     */     //   29: iload_2
/*     */     //   30: iconst_4
/*     */     //   31: imul
/*     */     //   32: iload_1
/*     */     //   33: iadd
/*     */     //   34: fload_3
/*     */     //   35: fastore
/*     */     //   36: nop
/*     */     //   37: iinc #2, 1
/*     */     //   40: goto -> 9
/*     */     //   43: iinc #1, 1
/*     */     //   46: goto -> 2
/*     */     //   49: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #199	-> 0
/*     */     //   #200	-> 7
/*     */     //   #201	-> 14
/*     */     //   #529	-> 28
/*     */     //   #530	-> 36
/*     */     //   #200	-> 37
/*     */     //   #199	-> 43
/*     */     //   #204	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   28	9	4	$i$f$set-impl	I
/*     */     //   25	12	3	v$iv	F
/*     */     //   9	34	2	r	I
/*     */     //   2	47	1	c	I
/*     */     //   0	50	0	arg0	[F }
/*     */   public static final void setFrom-58bKbWc(float[] arg0, @NotNull float[] matrix) { Intrinsics.checkNotNullParameter(matrix, "matrix"); for (int i = 0; i < 16; i++)
/*     */       arg0[i] = matrix[i];  }
/*     */   public static final void rotateX-impl(float[] arg0, float degrees) { float c = (float)Math.cos(degrees * Math.PI / 180.0D); float s = (float)Math.sin(degrees * Math.PI / 180.0D); byte b1 = 0; int column$iv = 1, $i$f$get-impl = 0;
/* 531 */     float a01 = arg0[b1 * 4 + column$iv]; column$iv = 0; int i = 2, j = 0;
/* 532 */     float a02 = arg0[column$iv * 4 + i]; float v01 = a01 * c - a02 * s; float v02 = a01 * s + a02 * c; byte b2 = 1; int k = 1, n = 0;
/* 533 */     float a11 = arg0[b2 * 4 + k]; k = 1; int m = 2, i1 = 0;
/* 534 */     float a12 = arg0[k * 4 + m]; float v11 = a11 * c - a12 * s; float v12 = a11 * s + a12 * c; byte b3 = 2; int i2 = 1, i4 = 0;
/* 535 */     float a21 = arg0[b3 * 4 + i2]; i2 = 2; int i3 = 2, i5 = 0;
/* 536 */     float a22 = arg0[i2 * 4 + i3]; float v21 = a21 * c - a22 * s; float v22 = a21 * s + a22 * c; byte b4 = 3; int i6 = 1, i8 = 0;
/* 537 */     float a31 = arg0[b4 * 4 + i6]; i6 = 3; int i7 = 2, i9 = 0;
/* 538 */     float a32 = arg0[i6 * 4 + i7]; float v31 = a31 * c - a32 * s; float v32 = a31 * s + a32 * c; i9 = 0; int i10 = 1, $i$f$set-impl = 0;
/* 539 */     arg0[i9 * 4 + i10] = v01; int row$iv = 0; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 541 */     arg0[row$iv * 4 + i10] = v02; row$iv = 1; i10 = 1;
/*     */     $i$f$set-impl = 0;
/* 543 */     arg0[row$iv * 4 + i10] = v11; row$iv = 1; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 545 */     arg0[row$iv * 4 + i10] = v12; row$iv = 2; i10 = 1;
/*     */     $i$f$set-impl = 0;
/* 547 */     arg0[row$iv * 4 + i10] = v21; row$iv = 2; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 549 */     arg0[row$iv * 4 + i10] = v22; row$iv = 3; i10 = 1;
/*     */     $i$f$set-impl = 0;
/* 551 */     arg0[row$iv * 4 + i10] = v31; row$iv = 3; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 553 */     arg0[row$iv * 4 + i10] = v32; } public static final void rotateY-impl(float[] arg0, float degrees) { float c = (float)Math.cos(degrees * Math.PI / 180.0D); float s = (float)Math.sin(degrees * Math.PI / 180.0D); byte b1 = 0;
/*     */     int column$iv = 0, $i$f$get-impl = 0;
/* 555 */     float a00 = arg0[b1 * 4 + column$iv]; column$iv = 0; int i = 2, j = 0;
/* 556 */     float a02 = arg0[column$iv * 4 + i]; float v00 = a00 * c + a02 * s; float v02 = -a00 * s + a02 * c; byte b2 = 1; int k = 0, n = 0;
/* 557 */     float a10 = arg0[b2 * 4 + k]; k = 1; int m = 2, i1 = 0;
/* 558 */     float a12 = arg0[k * 4 + m]; float v10 = a10 * c + a12 * s; float v12 = -a10 * s + a12 * c; byte b3 = 2; int i2 = 0, i4 = 0;
/* 559 */     float a20 = arg0[b3 * 4 + i2]; i2 = 2; int i3 = 2, i5 = 0;
/* 560 */     float a22 = arg0[i2 * 4 + i3]; float v20 = a20 * c + a22 * s; float v22 = -a20 * s + a22 * c; byte b4 = 3; int i6 = 0, i8 = 0;
/* 561 */     float a30 = arg0[b4 * 4 + i6]; i6 = 3; int i7 = 2, i9 = 0;
/* 562 */     float a32 = arg0[i6 * 4 + i7]; float v30 = a30 * c + a32 * s; float v32 = -a30 * s + a32 * c; i9 = 0; int i10 = 0, $i$f$set-impl = 0;
/* 563 */     arg0[i9 * 4 + i10] = v00; int row$iv = 0; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 565 */     arg0[row$iv * 4 + i10] = v02; row$iv = 1; i10 = 0;
/*     */     $i$f$set-impl = 0;
/* 567 */     arg0[row$iv * 4 + i10] = v10; row$iv = 1; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 569 */     arg0[row$iv * 4 + i10] = v12; row$iv = 2; i10 = 0;
/*     */     $i$f$set-impl = 0;
/* 571 */     arg0[row$iv * 4 + i10] = v20; row$iv = 2; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 573 */     arg0[row$iv * 4 + i10] = v22; row$iv = 3; i10 = 0;
/*     */     $i$f$set-impl = 0;
/* 575 */     arg0[row$iv * 4 + i10] = v30; row$iv = 3; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 577 */     arg0[row$iv * 4 + i10] = v32; } public static final void rotateZ-impl(float[] arg0, float degrees) { float c = (float)Math.cos(degrees * Math.PI / 180.0D); float s = (float)Math.sin(degrees * Math.PI / 180.0D); byte b1 = 0;
/*     */     int column$iv = 0, $i$f$get-impl = 0;
/* 579 */     float a00 = arg0[b1 * 4 + column$iv]; column$iv = 1; int i = 0, j = 0;
/* 580 */     float a10 = arg0[column$iv * 4 + i]; float v00 = c * a00 + s * a10; float v10 = -s * a00 + c * a10; byte b2 = 0; int k = 1, n = 0;
/* 581 */     float a01 = arg0[b2 * 4 + k]; k = 1; int m = 1, i1 = 0;
/* 582 */     float a11 = arg0[k * 4 + m]; float v01 = c * a01 + s * a11; float v11 = -s * a01 + c * a11; byte b3 = 0; int i2 = 2, i4 = 0;
/* 583 */     float a02 = arg0[b3 * 4 + i2]; i2 = 1; int i3 = 2, i5 = 0;
/* 584 */     float a12 = arg0[i2 * 4 + i3]; float v02 = c * a02 + s * a12; float v12 = -s * a02 + c * a12; byte b4 = 0; int i6 = 3, i8 = 0;
/* 585 */     float a03 = arg0[b4 * 4 + i6]; i6 = 1; int i7 = 3, i9 = 0;
/* 586 */     float a13 = arg0[i6 * 4 + i7]; float v03 = c * a03 + s * a13; float v13 = -s * a03 + c * a13; i9 = 0; int i10 = 0, $i$f$set-impl = 0;
/* 587 */     arg0[i9 * 4 + i10] = v00; int row$iv = 0; i10 = 1;
/*     */     $i$f$set-impl = 0;
/* 589 */     arg0[row$iv * 4 + i10] = v01; row$iv = 0; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 591 */     arg0[row$iv * 4 + i10] = v02; row$iv = 0; i10 = 3;
/*     */     $i$f$set-impl = 0;
/* 593 */     arg0[row$iv * 4 + i10] = v03; row$iv = 1; i10 = 0;
/*     */     $i$f$set-impl = 0;
/* 595 */     arg0[row$iv * 4 + i10] = v10; row$iv = 1; i10 = 1;
/*     */     $i$f$set-impl = 0;
/* 597 */     arg0[row$iv * 4 + i10] = v11; row$iv = 1; i10 = 2;
/*     */     $i$f$set-impl = 0;
/* 599 */     arg0[row$iv * 4 + i10] = v12; row$iv = 1; i10 = 3;
/*     */     $i$f$set-impl = 0;
/* 601 */     arg0[row$iv * 4 + i10] = v13; } public static final void scale-impl(float[] arg0, float x, float y, float z) { byte b1 = 0, b2 = 0, b3 = 0;
/*     */     int i29 = 0, $i$f$get-impl = 0;
/* 603 */     float f11 = arg0[b3 * 4 + i29] * x;
/*     */     
/*     */     int i28 = 0;
/* 606 */     arg0[b1 * 4 + b2] = f11; int row$iv = 0, column$iv = 1, i6 = 0, i27 = 1;
/*     */     $i$f$get-impl = 0;
/* 608 */     float f10 = arg0[i6 * 4 + i27] * x;
/*     */     
/*     */     int i26 = 0;
/* 611 */     arg0[row$iv * 4 + column$iv] = f10; row$iv = 0; column$iv = 2; int i5 = 0, i25 = 2;
/*     */     $i$f$get-impl = 0;
/* 613 */     float f9 = arg0[i5 * 4 + i25] * x;
/*     */     
/*     */     int i24 = 0;
/* 616 */     arg0[row$iv * 4 + column$iv] = f9; row$iv = 0; column$iv = 3; int i4 = 0, i23 = 3;
/*     */     $i$f$get-impl = 0;
/* 618 */     float f8 = arg0[i4 * 4 + i23] * x;
/*     */     
/*     */     int i22 = 0;
/* 621 */     arg0[row$iv * 4 + column$iv] = f8; row$iv = 1; column$iv = 0; int i3 = 1, i21 = 0;
/*     */     $i$f$get-impl = 0;
/* 623 */     float f7 = arg0[i3 * 4 + i21] * y;
/*     */     
/*     */     int i20 = 0;
/* 626 */     arg0[row$iv * 4 + column$iv] = f7; row$iv = 1; column$iv = 1; int i2 = 1, i19 = 1;
/*     */     $i$f$get-impl = 0;
/* 628 */     float f6 = arg0[i2 * 4 + i19] * y;
/*     */     
/*     */     int i18 = 0;
/* 631 */     arg0[row$iv * 4 + column$iv] = f6; row$iv = 1; column$iv = 2; int i1 = 1, i17 = 2;
/*     */     $i$f$get-impl = 0;
/* 633 */     float f5 = arg0[i1 * 4 + i17] * y;
/*     */     
/*     */     int i16 = 0;
/* 636 */     arg0[row$iv * 4 + column$iv] = f5; row$iv = 1; column$iv = 3; int n = 1, i15 = 3;
/*     */     $i$f$get-impl = 0;
/* 638 */     float f4 = arg0[n * 4 + i15] * y;
/*     */     
/*     */     int i14 = 0;
/* 641 */     arg0[row$iv * 4 + column$iv] = f4; row$iv = 2; column$iv = 0; int m = 2, i13 = 0;
/*     */     $i$f$get-impl = 0;
/* 643 */     float f3 = arg0[m * 4 + i13] * z;
/*     */     
/*     */     int i12 = 0;
/* 646 */     arg0[row$iv * 4 + column$iv] = f3; row$iv = 2; column$iv = 1; int k = 2, i11 = 1;
/*     */     $i$f$get-impl = 0;
/* 648 */     float f2 = arg0[k * 4 + i11] * z;
/*     */     
/*     */     int i10 = 0;
/* 651 */     arg0[row$iv * 4 + column$iv] = f2; row$iv = 2; column$iv = 2; int j = 2, i9 = 2;
/*     */     $i$f$get-impl = 0;
/* 653 */     float f1 = arg0[j * 4 + i9] * z;
/*     */     
/*     */     int i8 = 0;
/* 656 */     arg0[row$iv * 4 + column$iv] = f1; row$iv = 2; column$iv = 3; int i = 2, i7 = 3;
/*     */     $i$f$get-impl = 0;
/* 658 */     float v$iv = arg0[i * 4 + i7] * z;
/*     */     
/*     */     int $i$f$set-impl = 0;
/* 661 */     arg0[row$iv * 4 + column$iv] = v$iv; } public static final void translate-impl(float[] arg0, float x, float y, float z) { byte b = 0; int column$iv = 0, $i$f$get-impl = 0; int row$iv = 1; column$iv = 0; $i$f$get-impl = 0; row$iv = 2; column$iv = 0; $i$f$get-impl = 0; row$iv = 3; column$iv = 0;
/*     */     $i$f$get-impl = 0;
/* 663 */     float t1 = arg0[b * 4 + column$iv] * x + 
/* 664 */       arg0[row$iv * 4 + column$iv] * y + 
/* 665 */       arg0[row$iv * 4 + column$iv] * z + 
/* 666 */       arg0[row$iv * 4 + column$iv]; column$iv = 0; int k = 1, i1 = 0; int i = 1; k = 1; i1 = 0; i = 2; k = 1; i1 = 0; i = 3; k = 1; i1 = 0;
/* 667 */     float t2 = arg0[column$iv * 4 + k] * x + 
/* 668 */       arg0[i * 4 + k] * y + 
/* 669 */       arg0[i * 4 + k] * z + 
/* 670 */       arg0[i * 4 + k]; k = 0; int n = 2, i3 = 0; int j = 1; n = 2; i3 = 0; j = 2; n = 2; i3 = 0; j = 3; n = 2; i3 = 0;
/* 671 */     float t3 = arg0[k * 4 + n] * x + 
/* 672 */       arg0[j * 4 + n] * y + 
/* 673 */       arg0[j * 4 + n] * z + 
/* 674 */       arg0[j * 4 + n]; n = 0; int i2 = 3, i4 = 0; int m = 1; i2 = 3; i4 = 0; m = 2; i2 = 3; i4 = 0; m = 3; i2 = 3; i4 = 0;
/* 675 */     float t4 = arg0[n * 4 + i2] * x + 
/* 676 */       arg0[m * 4 + i2] * y + 
/* 677 */       arg0[m * 4 + i2] * z + 
/* 678 */       arg0[m * 4 + i2]; m = 3; i2 = 0; int $i$f$set-impl = 0;
/* 679 */     arg0[m * 4 + i2] = t1; m = 3; i2 = 1;
/*     */     $i$f$set-impl = 0;
/* 681 */     arg0[m * 4 + i2] = t2; m = 3; i2 = 2;
/*     */     $i$f$set-impl = 0;
/* 683 */     arg0[m * 4 + i2] = t3; m = 3; i2 = 3;
/*     */     $i$f$set-impl = 0;
/* 685 */     arg0[m * 4 + i2] = t4; }
/*     */ 
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
/*     */     return !(other instanceof Matrix) ? false : (!!Intrinsics.areEqual(arg0, ((Matrix)other).unbox-impl()));
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
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000R\016\020\n\032\0020\004XT¢\006\002\n\000R\016\020\013\032\0020\004XT¢\006\002\n\000R\016\020\f\032\0020\004XT¢\006\002\n\000R\016\020\r\032\0020\004XT¢\006\002\n\000R\016\020\016\032\0020\004XT¢\006\002\n\000¨\006\017"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Matrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */