/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ 
/*    */ import com.intellij.ide.ui.LafManager;
/*    */ import com.intellij.ide.ui.LafManagerListener;
/*    */ import com.intellij.openapi.editor.colors.ColorKey;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsManager;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*    */ import com.intellij.util.messages.MessageBusConnection;
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\002\n\000\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\032\020\024\032\004\030\0010\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\007J\026\020\032\032\020\022\004\022\0020\017\022\004\022\0020\017\030\0010\033H\002J\b\020\034\032\0020\035H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\013\020\nR\020\020\f\032\004\030\0010\rX\016¢\006\002\n\000R\026\020\016\032\004\030\0010\0178BX\004¢\006\006\032\004\b\020\020\021R\026\020\022\032\004\030\0010\0178BX\004¢\006\006\032\004\b\023\020\021¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "Lcom/intellij/openapi/Disposable;", "scheme", "Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "colorStartKey", "Lcom/intellij/openapi/editor/colors/ColorKey;", "colorEndKey", "<init>", "(Lcom/intellij/openapi/editor/colors/EditorColorsScheme;Lcom/intellij/openapi/editor/colors/ColorKey;Lcom/intellij/openapi/editor/colors/ColorKey;)V", "getColorStartKey", "()Lcom/intellij/openapi/editor/colors/ColorKey;", "getColorEndKey", "texture", "Ljava/awt/TexturePaint;", "colorStart", "Ljava/awt/Color;", "getColorStart", "()Ljava/awt/Color;", "colorEnd", "getColorEnd", "getTexture", "Ljava/awt/Paint;", "graphics", "Ljava/awt/Graphics2D;", "width", "", "getGradientRange", "Lkotlin/Pair;", "dispose", "", "ej-core"})
/*    */ public final class GradientTextureCache implements Disposable {
/*    */   @NotNull
/*    */   private final EditorColorsScheme scheme;
/*    */   @NotNull
/*    */   private final ColorKey colorStartKey;
/*    */   
/* 21 */   public GradientTextureCache(@NotNull EditorColorsScheme scheme, @NotNull ColorKey colorStartKey, @NotNull ColorKey colorEndKey) { this.scheme = scheme;
/* 22 */     this.colorStartKey = colorStartKey;
/* 23 */     this.colorEndKey = colorEndKey;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     MessageBusConnection connection = ApplicationManager.getApplication().getMessageBus().connect(this);
/* 34 */     Intrinsics.checkNotNullExpressionValue(LafManagerListener.TOPIC, "TOPIC"); connection.subscribe(LafManagerListener.TOPIC, this::_init_$lambda$0);
/*    */ 
/*    */     
/* 37 */     Intrinsics.checkNotNullExpressionValue(EditorColorsManager.TOPIC, "TOPIC"); connection.subscribe(EditorColorsManager.TOPIC, this::_init_$lambda$1); }
/* 38 */   @NotNull private final ColorKey colorEndKey; @Nullable private TexturePaint texture; @NotNull public final ColorKey getColorStartKey() { return this.colorStartKey; } @NotNull public final ColorKey getColorEndKey() { return this.colorEndKey; } private static final void _init_$lambda$1(GradientTextureCache this$0, EditorColorsScheme it) { this$0.texture = null; }
/*    */    private final Color getColorStart() {
/*    */     return this.scheme.getColor(this.colorStartKey);
/*    */   } private final Color getColorEnd() {
/*    */     return this.scheme.getColor(this.colorEndKey);
/*    */   }
/*    */   private static final void _init_$lambda$0(GradientTextureCache this$0, LafManager it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     this$0.texture = null;
/*    */   }
/*    */   @RequiresEdt
/*    */   @Nullable
/*    */   public final Paint getTexture(@NotNull Graphics2D graphics, int width) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'graphics'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokestatic sysScale : (Ljava/awt/Graphics2D;)F
/*    */     //   10: iload_2
/*    */     //   11: i2f
/*    */     //   12: fmul
/*    */     //   13: f2d
/*    */     //   14: invokestatic floor : (D)D
/*    */     //   17: d2f
/*    */     //   18: f2i
/*    */     //   19: istore_3
/*    */     //   20: aload_0
/*    */     //   21: getfield texture : Ljava/awt/TexturePaint;
/*    */     //   24: astore #4
/*    */     //   26: aload #4
/*    */     //   28: ifnull -> 60
/*    */     //   31: aload #4
/*    */     //   33: invokevirtual getImage : ()Ljava/awt/image/BufferedImage;
/*    */     //   36: astore #5
/*    */     //   38: aload #5
/*    */     //   40: ifnull -> 60
/*    */     //   43: iload_3
/*    */     //   44: aload #5
/*    */     //   46: invokevirtual getWidth : ()I
/*    */     //   49: if_icmpne -> 56
/*    */     //   52: iconst_1
/*    */     //   53: goto -> 61
/*    */     //   56: iconst_0
/*    */     //   57: goto -> 61
/*    */     //   60: iconst_0
/*    */     //   61: ifne -> 123
/*    */     //   64: aload_0
/*    */     //   65: aload_0
/*    */     //   66: invokespecial getGradientRange : ()Lkotlin/Pair;
/*    */     //   69: dup
/*    */     //   70: ifnull -> 118
/*    */     //   73: astore #6
/*    */     //   75: astore #8
/*    */     //   77: iconst_0
/*    */     //   78: istore #7
/*    */     //   80: getstatic com/intellij/ui/AppUIUtil.INSTANCE : Lcom/intellij/ui/AppUIUtil;
/*    */     //   83: aload_1
/*    */     //   84: checkcast java/awt/Graphics
/*    */     //   87: aload #6
/*    */     //   89: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   92: checkcast java/awt/Color
/*    */     //   95: aload #6
/*    */     //   97: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   100: checkcast java/awt/Color
/*    */     //   103: iload_2
/*    */     //   104: iconst_0
/*    */     //   105: iconst_0
/*    */     //   106: bipush #48
/*    */     //   108: aconst_null
/*    */     //   109: invokestatic createHorizontalGradientTexture$default : (Lcom/intellij/ui/AppUIUtil;Ljava/awt/Graphics;Ljava/awt/Color;Ljava/awt/Color;IIIILjava/lang/Object;)Ljava/awt/TexturePaint;
/*    */     //   112: aload #8
/*    */     //   114: swap
/*    */     //   115: goto -> 120
/*    */     //   118: pop
/*    */     //   119: aconst_null
/*    */     //   120: putfield texture : Ljava/awt/TexturePaint;
/*    */     //   123: aload_0
/*    */     //   124: getfield texture : Ljava/awt/TexturePaint;
/*    */     //   127: checkcast java/awt/Paint
/*    */     //   130: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 6
/*    */     //   #44	-> 18
/*    */     //   #45	-> 20
/*    */     //   #46	-> 64
/*    */     //   #47	-> 80
/*    */     //   #46	-> 115
/*    */     //   #46	-> 118
/*    */     //   #50	-> 123
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   80	32	7	$i$a$-let-GradientTextureCache$getTexture$1	I
/*    */     //   77	35	6	it	Lkotlin/Pair;
/*    */     //   20	111	3	realWidth	I
/*    */     //   0	131	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;
/*    */     //   0	131	1	graphics	Ljava/awt/Graphics2D;
/*    */     //   0	131	2	width	I
/*    */   }
/*    */   private final Pair<Color, Color> getGradientRange() {
/* 54 */     Color resolvedColorStart = getColorStart();
/* 55 */     Color resolvedColorEnd = getColorEnd();
/*    */     
/* 57 */     if (resolvedColorStart == null) Intrinsics.checkNotNull(resolvedColorEnd);  if (resolvedColorEnd == null) Intrinsics.checkNotNull(resolvedColorStart);  return (resolvedColorStart != null || resolvedColorEnd != null) ? TuplesKt.to(resolvedColorEnd, resolvedColorStart) : 
/*    */       
/* 59 */       null;
/*    */   }
/*    */   
/*    */   public void dispose() {
/* 63 */     this.texture = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\GradientTextureCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */