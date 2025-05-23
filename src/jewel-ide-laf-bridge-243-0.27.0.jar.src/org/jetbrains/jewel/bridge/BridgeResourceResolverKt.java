/*    */ package org.jetbrains.jewel.bridge;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.ResourcePainterProvider;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\016\020\000\032\0020\0012\006\020\004\032\0020\005¨\006\006"}, d2 = {"bridgePainterProvider", "Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;", "path", "", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "ide-laf-bridge"})
/*    */ public final class BridgeResourceResolverKt {
/*    */   @NotNull
/*    */   public static final ResourcePainterProvider bridgePainterProvider(@NotNull String path) {
/*  9 */     Intrinsics.checkNotNullParameter(path, "path"); ClassLoader[] arrayOfClassLoader = new ClassLoader[2]; arrayOfClassLoader[0] = DirProvider.class.getClassLoader(); arrayOfClassLoader[1] = SwingBridgeService.class.getClassLoader(); return new ResourcePainterProvider(path, arrayOfClassLoader);
/*    */   }
/*    */   @NotNull
/*    */   public static final ResourcePainterProvider bridgePainterProvider(@NotNull IconKey iconKey) {
/* 13 */     Intrinsics.checkNotNullParameter(iconKey, "iconKey"); boolean isNewUi = BridgeUtilsKt.isNewUiTheme();
/*    */ 
/*    */     
/* 16 */     ClassLoader[] arrayOfClassLoader = new ClassLoader[2]; arrayOfClassLoader[0] = DirProvider.class.getClassLoader(); arrayOfClassLoader[1] = 
/* 17 */       SwingBridgeService.class.getClassLoader();
/*    */     return new ResourcePainterProvider(iconKey.path(isNewUi), arrayOfClassLoader);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeResourceResolverKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */