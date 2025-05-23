/*    */ package org.jetbrains.jewel.bridge;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0060\001j\002`\002:\002\t\nB\023\b\004\022\b\020\003\032\004\030\0010\004¢\006\004\b\005\020\006R\026\020\003\032\004\030\0010\004X\004¢\006\b\n\000\032\004\b\007\020\b\001\002\013\f¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/bridge/JewelBridgeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "KeyNotFoundException", "KeysNotFoundException", "Lorg/jetbrains/jewel/bridge/JewelBridgeException$KeyNotFoundException;", "Lorg/jetbrains/jewel/bridge/JewelBridgeException$KeysNotFoundException;", "ide-laf-bridge"}) @StabilityInferred(parameters = 1)
/*    */ public abstract class JewelBridgeException extends RuntimeException { @Nullable
/*  3 */   private final String message; private JewelBridgeException(String message) { super(message); this.message = message; } public static final int $stable; @Nullable public String getMessage() { return this.message; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006¨\006\007"}, d2 = {"Lorg/jetbrains/jewel/bridge/JewelBridgeException$KeyNotFoundException;", "Lorg/jetbrains/jewel/bridge/JewelBridgeException;", "key", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ide-laf-bridge"})
/*    */   @StabilityInferred(parameters = 1)
/*  5 */   public static final class KeyNotFoundException extends JewelBridgeException { public static final int $stable; public KeyNotFoundException(@NotNull String key, @NotNull String type) { super("Key '" + key + "' not found in Swing LaF, was expecting a value of type " + type, null); } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\004\b\007\030\0002\0020\001B\035\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\004¢\006\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/JewelBridgeException$KeysNotFoundException;", "Lorg/jetbrains/jewel/bridge/JewelBridgeException;", "keys", "", "", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "ide-laf-bridge"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class KeysNotFoundException extends JewelBridgeException { public static final int $stable; public KeysNotFoundException(@NotNull List keys, @NotNull String type) {
/*  8 */       super("Keys " + 
/*  9 */           CollectionsKt.joinToString$default(keys, ", ", null, null, 0, null, KeysNotFoundException::_init_$lambda$0, 30, null) + " not found in Swing LaF, was expecting a value of type " + 
/* 10 */           type, null);
/*    */     }
/*    */     
/*    */     private static final CharSequence _init_$lambda$0(String it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       return "'" + it + "'";
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelBridgeException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */