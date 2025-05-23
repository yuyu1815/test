/*   */ package org.jetbrains.jewel.bridge;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006¨\006\007"}, d2 = {"Lorg/jetbrains/jewel/bridge/JewelBridgeException$KeyNotFoundException;", "Lorg/jetbrains/jewel/bridge/JewelBridgeException;", "key", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ide-laf-bridge"})
/*   */ @StabilityInferred(parameters = 1)
/*   */ public final class KeyNotFoundException extends JewelBridgeException {
/*   */   public KeyNotFoundException(@NotNull String key, @NotNull String type) {
/* 5 */     super("Key '" + key + "' not found in Swing LaF, was expecting a value of type " + type, null);
/*   */   }
/*   */   
/*   */   public static final int $stable;
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelBridgeException$KeyNotFoundException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */