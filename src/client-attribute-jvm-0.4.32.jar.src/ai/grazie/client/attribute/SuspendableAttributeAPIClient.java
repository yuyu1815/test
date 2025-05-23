package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\004H@¢\006\002\020\006J\"\020\002\032\b\022\004\022\0020\0040\0032\f\020\007\032\b\022\004\022\0020\0040\003H¦@¢\006\002\020\bJ\030\020\t\032\004\030\0010\n2\006\020\005\032\0020\013H@¢\006\002\020\fJ\030\020\t\032\004\030\0010\r2\006\020\005\032\0020\016H@¢\006\002\020\017J\030\020\t\032\004\030\0010\0202\006\020\005\032\0020\021H@¢\006\002\020\022J\030\020\t\032\004\030\0010\0232\006\020\005\032\0020\024H@¢\006\002\020\025J\030\020\t\032\004\030\0010\0262\006\020\005\032\0020\027H@¢\006\002\020\030J\034\020\t\032\0020\0312\f\020\007\032\b\022\004\022\0020\0040\003H¦@¢\006\002\020\bJ\034\020\032\032\b\022\004\022\0020\0040\0032\006\020\033\032\0020\031H¦@¢\006\002\020\034J\036\020\032\032\0020\0132\006\020\005\032\0020\0132\006\020\035\032\0020\nH@¢\006\002\020\036J\036\020\032\032\0020\0162\006\020\005\032\0020\0162\006\020\035\032\0020\rH@¢\006\002\020\037J\036\020\032\032\0020\0212\006\020\005\032\0020\0212\006\020\035\032\0020\020H@¢\006\002\020 J\036\020\032\032\0020\0242\006\020\005\032\0020\0242\006\020\035\032\0020\023H@¢\006\002\020!J\036\020\032\032\0020\0272\006\020\005\032\0020\0272\006\020\035\032\0020\026H@¢\006\002\020\"J\036\020#\032\0020\0042\006\020\005\032\0020\0042\006\020\035\032\0020$H@¢\006\002\020%ø\001\000\002\006\n\004\b!0\001¨\006&À\006\001"}, d2 = {"Lai/grazie/client/attribute/SuspendableAttributeAPIClient;", "", "delete", "", "Lai/grazie/utils/attributes/Attributes$Key;", "key", "(Lai/grazie/utils/attributes/Attributes$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keys", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "(Lai/grazie/utils/attributes/Attributes$Key$Bool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Double;", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "(Lai/grazie/utils/attributes/Attributes$Key$Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "(Lai/grazie/utils/attributes/Attributes$Key$Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "(Lai/grazie/utils/attributes/Attributes$Key$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes;", "store", "attrs", "(Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "(Lai/grazie/utils/attributes/Attributes$Key$Bool;Lai/grazie/utils/attributes/Attributes$Value$Bool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Double;Lai/grazie/utils/attributes/Attributes$Value$Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;Lai/grazie/utils/attributes/Attributes$Value$Json;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Long;Lai/grazie/utils/attributes/Attributes$Value$Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Text;Lai/grazie/utils/attributes/Attributes$Value$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeUnsafe", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-attribute"})
public interface SuspendableAttributeAPIClient {
  @Nullable
  default Object store(@NotNull Attributes.Key.Long key, @NotNull Attributes.Value.Long value, @NotNull Continuation<? super Attributes.Key.Long> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Double key, @NotNull Attributes.Value.Double value, @NotNull Continuation<? super Attributes.Key.Double> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Text key, @NotNull Attributes.Value.Text value, @NotNull Continuation<? super Attributes.Key.Text> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Json key, @NotNull Attributes.Value.Json value, @NotNull Continuation<? super Attributes.Key.Json> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Bool key, @NotNull Attributes.Value.Bool value, @NotNull Continuation<? super Attributes.Key.Bool> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object storeUnsafe(@NotNull Attributes.Key key, @NotNull Attributes.Value value, @NotNull Continuation<? super Attributes.Key> $completion) {
    return storeUnsafe$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  Object store(@NotNull Attributes paramAttributes, @NotNull Continuation<? super Set<? extends Attributes.Key>> paramContinuation);
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Long key, @NotNull Continuation<? super Attributes.Value.Long> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Double key, @NotNull Continuation<? super Attributes.Value.Double> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Text key, @NotNull Continuation<? super Attributes.Value.Text> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Json key, @NotNull Continuation<? super Attributes.Value.Json> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Bool key, @NotNull Continuation<? super Attributes.Value.Bool> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  Object get(@NotNull Set<? extends Attributes.Key> paramSet, @NotNull Continuation<? super Attributes> paramContinuation);
  
  @Nullable
  default Object delete(@NotNull Attributes.Key key, @NotNull Continuation<? super Set<? extends Attributes.Key>> $completion) {
    return delete$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  Object delete(@NotNull Set<? extends Attributes.Key> paramSet, @NotNull Continuation<? super Set<? extends Attributes.Key>> paramContinuation);
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {22}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Long)null, (Continuation<? super Attributes.Value.Long>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {24}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$2 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$2(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Double)null, (Continuation<? super Attributes.Value.Double>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {26}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$3 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Text)null, (Continuation<? super Attributes.Value.Text>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {28}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$4 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$4(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Json)null, (Continuation<? super Attributes.Value.Json>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {30}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$5 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$5(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Bool)null, (Continuation<? super Attributes.Value.Bool>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {6}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$1 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Long)null, (Attributes.Value.Long)null, (Continuation<? super Attributes.Key.Long>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {8}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$2 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$2(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Double)null, (Attributes.Value.Double)null, (Continuation<? super Attributes.Key.Double>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {10}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$3 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Text)null, (Attributes.Value.Text)null, (Continuation<? super Attributes.Key.Text>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {12}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$4 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$4(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Json)null, (Attributes.Value.Json)null, (Continuation<? super Attributes.Key.Json>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {14}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$5 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$5(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Bool)null, (Attributes.Value.Bool)null, (Continuation<? super Attributes.Key.Bool>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {17}, i = {}, s = {}, n = {}, m = "storeUnsafe$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$storeUnsafe$1 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$storeUnsafe$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.storeUnsafe$suspendImpl(SuspendableAttributeAPIClient.this, null, null, (Continuation<? super Attributes.Key>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-attribute-jvm-0.4.32.jar!\ai\grazie\client\attribute\SuspendableAttributeAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */