/*    */ package org.jetbrains.jewel.bridge;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\004\b\007\030\0002\0020\001B\035\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\004¢\006\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/JewelBridgeException$KeysNotFoundException;", "Lorg/jetbrains/jewel/bridge/JewelBridgeException;", "keys", "", "", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class KeysNotFoundException extends JewelBridgeException {
/*    */   public KeysNotFoundException(@NotNull List keys, @NotNull String type) {
/*  8 */     super("Keys " + 
/*  9 */         CollectionsKt.joinToString$default(keys, ", ", null, null, 0, null, KeysNotFoundException::_init_$lambda$0, 30, null) + " not found in Swing LaF, was expecting a value of type " + 
/* 10 */         type, null);
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */   
/*    */   private static final CharSequence _init_$lambda$0(String it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return "'" + it + "'";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelBridgeException$KeysNotFoundException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */