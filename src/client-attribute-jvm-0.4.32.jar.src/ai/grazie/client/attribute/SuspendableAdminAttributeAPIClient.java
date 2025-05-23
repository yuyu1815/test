package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import ai.grazie.utils.mpp.UUID;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J2\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0050\0032\f\020\006\032\b\022\004\022\0020\0040\0072\006\020\b\032\0020\tH@¢\006\002\020\nJ2\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0130\0032\f\020\006\032\b\022\004\022\0020\0040\0072\006\020\b\032\0020\fH@¢\006\002\020\rJ2\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0160\0032\f\020\006\032\b\022\004\022\0020\0040\0072\006\020\b\032\0020\017H@¢\006\002\020\020J2\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0210\0032\f\020\006\032\b\022\004\022\0020\0040\0072\006\020\b\032\0020\022H@¢\006\002\020\023J2\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0240\0032\f\020\006\032\b\022\004\022\0020\0040\0072\006\020\b\032\0020\025H@¢\006\002\020\026J6\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0270\0032\f\020\006\032\b\022\004\022\0020\0040\0072\f\020\030\032\b\022\004\022\0020\0310\007H¦@¢\006\002\020\032J$\020\033\032\b\022\004\022\0020\0310\0072\006\020\034\032\0020\0042\006\020\035\032\0020\027H¦@¢\006\002\020\036J&\020\033\032\0020\t2\006\020\034\032\0020\0042\006\020\b\032\0020\t2\006\020\037\032\0020\005H@¢\006\002\020 J&\020\033\032\0020\f2\006\020\034\032\0020\0042\006\020\b\032\0020\f2\006\020\037\032\0020\013H@¢\006\002\020!J&\020\033\032\0020\0172\006\020\034\032\0020\0042\006\020\b\032\0020\0172\006\020\037\032\0020\016H@¢\006\002\020\"J&\020\033\032\0020\0222\006\020\034\032\0020\0042\006\020\b\032\0020\0222\006\020\037\032\0020\021H@¢\006\002\020#J&\020\033\032\0020\0252\006\020\034\032\0020\0042\006\020\b\032\0020\0252\006\020\037\032\0020\024H@¢\006\002\020$J&\020%\032\0020\0312\006\020\034\032\0020\0042\006\020\b\032\0020\0312\006\020\037\032\0020&H@¢\006\002\020'ø\001\000\002\006\n\004\b!0\001¨\006(À\006\001"}, d2 = {"Lai/grazie/client/attribute/SuspendableAdminAttributeAPIClient;", "", "get", "", "Lai/grazie/utils/mpp/UUID;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "uuids", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "(Ljava/util/Set;Lai/grazie/utils/attributes/Attributes$Key$Bool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Double;", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "(Ljava/util/Set;Lai/grazie/utils/attributes/Attributes$Key$Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "(Ljava/util/Set;Lai/grazie/utils/attributes/Attributes$Key$Json;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "(Ljava/util/Set;Lai/grazie/utils/attributes/Attributes$Key$Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "(Ljava/util/Set;Lai/grazie/utils/attributes/Attributes$Key$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes;", "keys", "Lai/grazie/utils/attributes/Attributes$Key;", "(Ljava/util/Set;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "store", "uuid", "attrs", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key$Bool;Lai/grazie/utils/attributes/Attributes$Value$Bool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key$Double;Lai/grazie/utils/attributes/Attributes$Value$Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key$Json;Lai/grazie/utils/attributes/Attributes$Value$Json;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key$Long;Lai/grazie/utils/attributes/Attributes$Value$Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key$Text;Lai/grazie/utils/attributes/Attributes$Value$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeUnsafe", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-attribute"})
@SourceDebugExtension({"SMAP\nSuspendableAdminAttributeAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableAdminAttributeAPIClient.kt\nai/grazie/client/attribute/SuspendableAdminAttributeAPIClient\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,35:1\n126#2:36\n153#2,3:37\n126#2:40\n153#2,3:41\n126#2:44\n153#2,3:45\n126#2:48\n153#2,3:49\n126#2:52\n153#2,3:53\n*S KotlinDebug\n*F\n+ 1 SuspendableAdminAttributeAPIClient.kt\nai/grazie/client/attribute/SuspendableAdminAttributeAPIClient\n*L\n23#1:36\n23#1:37,3\n25#1:40\n25#1:41,3\n27#1:44\n27#1:45,3\n29#1:48\n29#1:49,3\n31#1:52\n31#1:53,3\n*E\n"})
public interface SuspendableAdminAttributeAPIClient {
  @Nullable
  default Object store(@NotNull UUID uuid, @NotNull Attributes.Key.Long key, @NotNull Attributes.Value.Long value, @NotNull Continuation<? super Attributes.Key.Long> $completion) {
    return store$suspendImpl(this, uuid, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull UUID uuid, @NotNull Attributes.Key.Double key, @NotNull Attributes.Value.Double value, @NotNull Continuation<? super Attributes.Key.Double> $completion) {
    return store$suspendImpl(this, uuid, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull UUID uuid, @NotNull Attributes.Key.Text key, @NotNull Attributes.Value.Text value, @NotNull Continuation<? super Attributes.Key.Text> $completion) {
    return store$suspendImpl(this, uuid, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull UUID uuid, @NotNull Attributes.Key.Json key, @NotNull Attributes.Value.Json value, @NotNull Continuation<? super Attributes.Key.Json> $completion) {
    return store$suspendImpl(this, uuid, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull UUID uuid, @NotNull Attributes.Key.Bool key, @NotNull Attributes.Value.Bool value, @NotNull Continuation<? super Attributes.Key.Bool> $completion) {
    return store$suspendImpl(this, uuid, key, value, $completion);
  }
  
  @Nullable
  default Object storeUnsafe(@NotNull UUID uuid, @NotNull Attributes.Key key, @NotNull Attributes.Value value, @NotNull Continuation<? super Attributes.Key> $completion) {
    return storeUnsafe$suspendImpl(this, uuid, key, value, $completion);
  }
  
  @Nullable
  Object store(@NotNull UUID paramUUID, @NotNull Attributes paramAttributes, @NotNull Continuation<? super Set<? extends Attributes.Key>> paramContinuation);
  
  @Nullable
  default Object get(@NotNull Set<UUID> uuids, @NotNull Attributes.Key.Long key, @NotNull Continuation<? super Map<UUID, Attributes.Value.Long>> $completion) {
    return get$suspendImpl(this, uuids, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Set<UUID> uuids, @NotNull Attributes.Key.Double key, @NotNull Continuation<? super Map<UUID, Attributes.Value.Double>> $completion) {
    return get$suspendImpl(this, uuids, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Set<UUID> uuids, @NotNull Attributes.Key.Text key, @NotNull Continuation<? super Map<UUID, Attributes.Value.Text>> $completion) {
    return get$suspendImpl(this, uuids, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Set<UUID> uuids, @NotNull Attributes.Key.Json key, @NotNull Continuation<? super Map<UUID, Attributes.Value.Json>> $completion) {
    return get$suspendImpl(this, uuids, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Set<UUID> uuids, @NotNull Attributes.Key.Bool key, @NotNull Continuation<? super Map<UUID, Attributes.Value.Bool>> $completion) {
    return get$suspendImpl(this, uuids, key, $completion);
  }
  
  @Nullable
  Object get(@NotNull Set<UUID> paramSet, @NotNull Set<? extends Attributes.Key> paramSet1, @NotNull Continuation<? super Map<UUID, ? extends Attributes>> paramContinuation);
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {23}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$get$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAdminAttributeAPIClient$get$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.get$suspendImpl(SuspendableAdminAttributeAPIClient.this, (Set<UUID>)null, (Attributes.Key.Long)null, (Continuation<? super Map<UUID, Attributes.Value.Long>>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {25}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$get$3 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAdminAttributeAPIClient$get$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.get$suspendImpl(SuspendableAdminAttributeAPIClient.this, (Set<UUID>)null, (Attributes.Key.Double)null, (Continuation<? super Map<UUID, Attributes.Value.Double>>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {27}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$get$5 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAdminAttributeAPIClient$get$5(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.get$suspendImpl(SuspendableAdminAttributeAPIClient.this, (Set<UUID>)null, (Attributes.Key.Text)null, (Continuation<? super Map<UUID, Attributes.Value.Text>>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {29}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$get$7 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAdminAttributeAPIClient$get$7(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.get$suspendImpl(SuspendableAdminAttributeAPIClient.this, (Set<UUID>)null, (Attributes.Key.Json)null, (Continuation<? super Map<UUID, Attributes.Value.Json>>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {31}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$get$9 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAdminAttributeAPIClient$get$9(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.get$suspendImpl(SuspendableAdminAttributeAPIClient.this, (Set<UUID>)null, (Attributes.Key.Bool)null, (Continuation<? super Map<UUID, Attributes.Value.Bool>>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {7}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$store$1 extends ContinuationImpl {
    int label;
    
    SuspendableAdminAttributeAPIClient$store$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.store$suspendImpl(SuspendableAdminAttributeAPIClient.this, (UUID)null, (Attributes.Key.Long)null, (Attributes.Value.Long)null, (Continuation<? super Attributes.Key.Long>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {9}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$store$2 extends ContinuationImpl {
    int label;
    
    SuspendableAdminAttributeAPIClient$store$2(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.store$suspendImpl(SuspendableAdminAttributeAPIClient.this, (UUID)null, (Attributes.Key.Double)null, (Attributes.Value.Double)null, (Continuation<? super Attributes.Key.Double>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {11}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$store$3 extends ContinuationImpl {
    int label;
    
    SuspendableAdminAttributeAPIClient$store$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.store$suspendImpl(SuspendableAdminAttributeAPIClient.this, (UUID)null, (Attributes.Key.Text)null, (Attributes.Value.Text)null, (Continuation<? super Attributes.Key.Text>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {13}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$store$4 extends ContinuationImpl {
    int label;
    
    SuspendableAdminAttributeAPIClient$store$4(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.store$suspendImpl(SuspendableAdminAttributeAPIClient.this, (UUID)null, (Attributes.Key.Json)null, (Attributes.Value.Json)null, (Continuation<? super Attributes.Key.Json>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {15}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$store$5 extends ContinuationImpl {
    int label;
    
    SuspendableAdminAttributeAPIClient$store$5(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.store$suspendImpl(SuspendableAdminAttributeAPIClient.this, (UUID)null, (Attributes.Key.Bool)null, (Attributes.Value.Bool)null, (Continuation<? super Attributes.Key.Bool>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {18}, i = {}, s = {}, n = {}, m = "storeUnsafe$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAdminAttributeAPIClient$storeUnsafe$1 extends ContinuationImpl {
    int label;
    
    SuspendableAdminAttributeAPIClient$storeUnsafe$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAdminAttributeAPIClient.storeUnsafe$suspendImpl(SuspendableAdminAttributeAPIClient.this, null, null, null, (Continuation<? super Attributes.Key>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-attribute-jvm-0.4.32.jar!\ai\grazie\client\attribute\SuspendableAdminAttributeAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */